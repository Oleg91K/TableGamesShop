package ru.home.tablegamesshop.datasource;

import ru.home.tablegamesshop.datasource.DataSource;
import ru.home.tablegamesshop.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataSourceImpl implements DataSource {

    private static List<TableGame> tableGames = new ArrayList<>();
    private static List<Buyer> buyers = new ArrayList<>();
    private static List<Seller> sellers = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();

    public DataSourceImpl() {
        initData();
    }

    public static void initData () {
        sellers.add(new Seller(1, "Кирилл", "Кравец", "kiril_K_tablegameshop@ya.ru", 79112001220L));
        sellers.add(new Seller(2, "Ирина", "Магдалина", "Irina_M_tablegameshop@ya.ru", 79112001221L));
        sellers.add(new Seller(3, "Александр", "Ребро", "Alex_R_tablegameshop@ya.ru", 79112001222L));

        buyers.add(new Buyer(1, "Петр", "Иванов", "petr_ivan@mail.ru", 79501236840L));
        buyers.add(new Buyer(2, "Иван", "Калита", "ivan_kalita@mail.ru", 79216408592L));
        buyers.add(new Buyer(3, "Ольга", "Ермакова", "olga_ermak@mail.ru", 79111234560L));
        buyers.add(new Buyer(4, "Роман", "Головачев", "roman_gol@mail.ru", 79036708990L));
        buyers.add(new Buyer(5, "Анастасия", "Ляпко", "Anast_lypa@mail.ru", 79112405060L));
        buyers.add(new Buyer(6, "Мария", "Свиридова", "mary_svirid@mail.ru", 79045006072L));
        buyers.add(new Buyer(7, "Кирилл", "Петров", "kiril_petrov@mail.ru", 79521507640L));
        buyers.add(new Buyer(8, "Максим", "Руко", "max_ruko@mail.ru", 79218005032L));
        buyers.add(new Buyer(9, "Cветлана", "Бронских", "svet_brom@mail.ru", 79111224986L));

        tableGames.add(new TableGame(1, "Cyberpunk Red", "CD Project Red", 2990.00, TableGameGenerate.BoardRolePlayingGames));
        tableGames.add(new TableGame(2, "Катан", "Клаус Тойбер", 3990, TableGameGenerate.BoardRolePlayingGames));
        tableGames.add(new TableGame(3, "Ticket to Ride", "Алан Мун", 14990, TableGameGenerate.BoardRolePlayingGames));
        tableGames.add(new TableGame(4, "Каркассон", "Юрген Вреде", 1990, TableGameGenerate.BoardRolePlayingGames));
        tableGames.add(new TableGame(5, "Для Cyberpunk Red", "CD Project red", 1290, TableGameGenerate.Extensions));
        tableGames.add(new TableGame(6, "Для Катан", "Клаус Тойбер", 1890, TableGameGenerate.Extensions));
        tableGames.add(new TableGame(7, "Для Ticket to ride", "Алан Мун", 6490, TableGameGenerate.Extensions));
        tableGames.add(new TableGame(8, "Для Каркассон", "Юрген Вреде", 890, TableGameGenerate.Extensions));
        tableGames.add(new TableGame(9, "Грузовички", "Bondibon", 2990, TableGameGenerate.ChildrenGame));
        tableGames.add(new TableGame(10, "Cеверный полюс", "Smart Games", 1390, TableGameGenerate.ChildrenGame));
        tableGames.add(new TableGame(11, "Conector", "Educa", 1300, TableGameGenerate.ChildrenGame));
        tableGames.add(new TableGame(12, "Огниво", "Страна сказок", 490, TableGameGenerate.PuzzleGames));
        tableGames.add(new TableGame(13, "Пазл игра шахматы", "Davici", 5990, TableGameGenerate.PuzzleGames));
        tableGames.add(new TableGame(14, "Мозго Бум", "IQ Пазл", 250, TableGameGenerate.PuzzleGames));

        orders.add(new Order(1, 1, 2, new long[]{1, 5}));
        orders.add(new Order(2, 2, 2, new long[]{2, 6}));
        orders.add(new Order(3, 3, 1, new long[]{3, 7}));
        orders.add(new Order(4, 4, 3, new long[]{4, 8}));
        orders.add(new Order(5, 5, 1, new long[]{9}));
        orders.add(new Order(6, 6, 2, new long[]{10, 11}));
        orders.add(new Order(7, 7, 3, new long[]{12, 13, 14}));
        orders.add(new Order(8, 8, 1, new long[]{3, 4}));
        orders.add(new Order(9, 9, 1, new long[]{1, 10}));

    }

    @Override
    public List<TableGame> getTableGames() {
        return tableGames;
    }

    @Override
    public List<Buyer> getBuyers() {
        return buyers;
    }

    @Override
    public List<Seller> getSellers() {
        return sellers;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }
}
