package ru.home.tablegamesshop.model;

public class TableGameAdditional {
    private TableGameGenerate tableGameGenerate;
    private int count;

    public TableGameAdditional(TableGameGenerate tableGameGenerate, int count) {
        this.tableGameGenerate = tableGameGenerate;
        this.count = count;
    }

    public TableGameGenerate getTableGameGenerate() {
        return tableGameGenerate;
    }

    public void setTableGameGenerate(TableGameGenerate tableGameGenerate) {
        this.tableGameGenerate = tableGameGenerate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TableGameAdditional{" +
                "tableGameGenerate=" + tableGameGenerate +
                ", count=" + count +
                '}';
    }
}
