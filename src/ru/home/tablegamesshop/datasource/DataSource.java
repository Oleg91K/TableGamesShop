package ru.home.tablegamesshop.datasource;

import ru.home.tablegamesshop.model.Buyer;
import ru.home.tablegamesshop.model.Order;
import ru.home.tablegamesshop.model.Seller;
import ru.home.tablegamesshop.model.TableGame;
import ru.home.tablegamesshop.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public interface DataSource  {
    List<TableGame> getTableGames();
    List<Buyer> getBuyers();
    List<Seller> getSellers();
    List<Order> getOrders();
}
