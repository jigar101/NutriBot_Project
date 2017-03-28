package com.apps.nutribot;

public class ItemCalorie {

    String id,food,gram,piece;

    public ItemCalorie(String id,String food,String gram,String piece) {
        this.id= id;
        this.food= food;
        this.gram= gram;
        this.piece= piece;
    }

    public String getId() {
        return id;
    }

    public String getFood() {
        return food;
    }

    public String getGram() {
        return gram;
    }

    public String getPiece() {
        return piece;
    }
}
