package ru.home.tablegamesshop.model;

public enum TableGameGenerate {
    BoardRolePlayingGames("Ролевые настольные игры"),
    Extensions("Дополнения к настольным играм"),
    ChildrenGame("Детские игры"),
    PuzzleGames("Головоломки");

    public String translation;

    TableGameGenerate(String translation){
        this.translation = translation;

    }



}
