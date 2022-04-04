package ru.home.tablegamesshop.repository;

import ru.home.tablegamesshop.model.*;

import java.util.ArrayList;
import java.util.HashMap;

public interface Repository {
    int getCountSellTableGames();
    TableGame getTableGameId(long id);
    double getPriceSellTableGamesInOrder(Order order);
    double getAllPriceSellTableGames();
    Profit getProfitBySeller(long sellerId);
    double getPriceSellTableGamesByGenerate(Order order, TableGameGenerate tableGameGenerate);
    HashMap<TableGameGenerate,Double> getPriceSellBooksByGenre ();
    int getCountSellTableGamesByGenerate(Order order,TableGameGenerate tableGameGenerate);
    ArrayList<TableGameAdditional> getCountSellTableGameByGenre();


}



