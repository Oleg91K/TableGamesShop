package ru.home.tablegamesshop.ui;

import ru.home.tablegamesshop.datasource.DataSource;
import ru.home.tablegamesshop.model.Buyer;
import ru.home.tablegamesshop.model.Order;
import ru.home.tablegamesshop.model.Seller;
import ru.home.tablegamesshop.model.TableGame;
import ru.home.tablegamesshop.repository.Repository;


public class Adapter {
    private final Repository repository;
    private final DataSource dataSource;

    public Adapter(Repository repository, DataSource dataSource) {
        this.repository = repository;
        this.dataSource = dataSource;
    }

    public void show(){
        //получение игры по id
        System.out.println(repository.getTableGameId(5));
        //общее количество проданных игр
        System.out.println("Общее количество проданных настольных игр: " + repository.getCountSellTableGames());
        //общая сумма проданных игр в заказе(в одном)
        System.out.println("Общая сумма проданных игр заказе составила: " + repository.getPriceSellTableGamesInOrder(dataSource.getOrders().get(5)) + " рублей");
        //сумма продажи всех игр
        System.out.println("Сумма продажи всех игр: " + repository.getAllPriceSellTableGames());
        //кол-во и общая стоимость проданных игр для продавцов
        for (Seller seller : dataSource.getSellers()) {
            System.out.println("Продавец: \n" + "Имя: " + seller.getName() + " " + "Фамилия: " + seller.getSurname() + " " + " email: " + seller.getEmail() + " "
                    + "Телефон: " + seller.getPhoneNumber() + " " + "Продал(а) "
                    + repository.getProfitBySeller(seller.getId()));
            System.out.println(repository.getPriceSellBooksByGenre());
            System.out.println(repository.getCountSellTableGameByGenre());
         }
    }
}
