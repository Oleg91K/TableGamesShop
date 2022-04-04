package ru.home.tablegamesshop.repository;

import ru.home.tablegamesshop.datasource.DataSource;
import ru.home.tablegamesshop.model.*;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositoryImpl implements Repository{
    private final DataSource dataSource;

    public RepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //общее количество проданных игр
    @Override
    public int getCountSellTableGames() {
        int count = 0;
        for (Order order : dataSource.getOrders()) {
            count += order.getTableGame().length;
        }
        return count;
    }


    //получение игры по Id
    @Override
    public TableGame getTableGameId(long id) {
        TableGame tableGame = null;
        for (TableGame game : dataSource.getTableGames()) {
            if (game.getId() == id) {
                tableGame = game;
                break;
            }
        }
        return tableGame;
    }

    //сумма проданных игр в заказе
    @Override
    public double getPriceSellTableGamesInOrder(Order order) {
        double price = 0;
        for (long tableGameId : order.getTableGame()) {
            TableGame tableGame = getTableGameId(tableGameId);
            if(tableGame !=null)
                price += tableGame.getPrice();
        }
        return price;
    }

    //полная стоимость всех проданных игр
    @Override
    public double getAllPriceSellTableGames() {
        double price = 0;
        for (Order order : dataSource.getOrders()) {
            price +=getPriceSellTableGamesInOrder(order);
        }
        return price;
    }

    //получить кол-во и стоимость проданных игр для продавца
    @Override
    public Profit getProfitBySeller(long sellerId) {
        int count = 0;
        double price = 0;
        for (Order order : dataSource.getOrders()) {
            if(order.getSellerId() == sellerId){
                price += getPriceSellTableGamesInOrder(order);
                count += order.getTableGame().length;
            }
        }
        return new Profit(count,price);
    }

    //общая стоимость книг в заказе по определенному жанру
    @Override
    public double getPriceSellTableGamesByGenerate(Order order, TableGameGenerate tableGameGenerate) {
        double price = 0;
        for (long tableGameId : order.getTableGame()) {
            TableGame tableGame = getTableGameId(tableGameId);
            if(tableGame !=null && tableGame.getTableGameGenerate()==tableGameGenerate)
                price += tableGame.getPrice();
        }
        return price;
    }

    //получить стоимость проданных игр по видам
    @Override
    public HashMap<TableGameGenerate, Double> getPriceSellBooksByGenre() {
        HashMap<TableGameGenerate,Double> result = new HashMap<>();
        double priceBoardRolePlayingGames = 0;
        double priceExtensions = 0;
        double priceChildrenGame = 0;
        double pricePuzzleGames = 0;
        for (Order order : dataSource.getOrders()) {
            priceBoardRolePlayingGames +=getPriceSellTableGamesByGenerate(order,TableGameGenerate.BoardRolePlayingGames);
            priceExtensions +=getPriceSellTableGamesByGenerate(order,TableGameGenerate.Extensions);
            priceChildrenGame +=getPriceSellTableGamesByGenerate(order,TableGameGenerate.ChildrenGame);
            pricePuzzleGames +=getPriceSellTableGamesByGenerate(order,TableGameGenerate.PuzzleGames);
        }
        result.put(TableGameGenerate.BoardRolePlayingGames,priceBoardRolePlayingGames);
        result.put(TableGameGenerate.Extensions,priceExtensions);
        result.put(TableGameGenerate.ChildrenGame,priceChildrenGame);
        result.put(TableGameGenerate.PuzzleGames,pricePuzzleGames);

        return result;
    }

    //количество игр в одном заказе по определенному виду
    @Override
    public int getCountSellTableGamesByGenerate(Order order, TableGameGenerate tableGameGenerate) {
        int count = 0;
        for (long tableGameId : order.getTableGame()) {
            TableGame tableGame = getTableGameId(tableGameId);
            if(tableGame !=null && tableGame.getTableGameGenerate()==tableGameGenerate)
                count++;
        }
        return count;
    }

    //получить количество книг по жанрам
    @Override
    public ArrayList<TableGameAdditional> getCountSellTableGameByGenre() {
        ArrayList<TableGameAdditional> result = new ArrayList<>();
        int countBoardRolePlayingGames = 0,countExtensions = 0, countChildrenGame = 0,countPuzzleGames = 0;
        for (Order order : dataSource.getOrders()) {
            countBoardRolePlayingGames+=getCountSellTableGamesByGenerate(order,TableGameGenerate.BoardRolePlayingGames);
            countExtensions += getCountSellTableGamesByGenerate(order,TableGameGenerate.Extensions);
            countChildrenGame += getCountSellTableGamesByGenerate(order,TableGameGenerate.ChildrenGame);
            countPuzzleGames += getCountSellTableGamesByGenerate(order,TableGameGenerate.PuzzleGames);
        }
        result.add(new TableGameAdditional(TableGameGenerate.BoardRolePlayingGames,countBoardRolePlayingGames));
        result.add(new TableGameAdditional(TableGameGenerate.Extensions,countExtensions));
        result.add(new TableGameAdditional(TableGameGenerate.ChildrenGame,countChildrenGame));
        result.add(new TableGameAdditional(TableGameGenerate.PuzzleGames,countPuzzleGames));

        return result;
    }
}
