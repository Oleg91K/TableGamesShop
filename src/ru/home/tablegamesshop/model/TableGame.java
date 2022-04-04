package ru.home.tablegamesshop.model;

public class TableGame {
    private long id;
    private String title;
    private String author;
    private double price;
    private TableGameGenerate tableGameGenerate;

    public TableGame(){

    }

    public TableGame(long id, String title, String author, double price, TableGameGenerate tableGameGenerate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.tableGameGenerate = tableGameGenerate;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TableGameGenerate getTableGameGenerate() {
        return tableGameGenerate;
    }

    public void setTableGameGenerate(TableGameGenerate tableGameGenerate) {
        this.tableGameGenerate = tableGameGenerate;
    }

    @Override
    public String toString() {
        return
                "Порядковый номер " + id +
                " Название " + title +
                " Автор " + author +
                " Цена " + price +
                " Вид настольной игры " + tableGameGenerate.translation;

    }
}
