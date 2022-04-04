package ru.home.tablegamesshop.model;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
    private long id;
    private long buyerId;
    private long sellerId;
    private long [] tableGame;

    public Order(long id, long buyerId, long sellerId,  long[] tableGame) {
        this.id = id;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.tableGame = tableGame;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public long[] getTableGame() {
        return tableGame;
    }

    public void setTableGame(long[] tableGame) {
        this.tableGame = tableGame;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", buyerId=" + buyerId +
                ", sellerId=" + sellerId +
                ", tableGame=" + Arrays.toString(tableGame) +
                '}';
    }
}
