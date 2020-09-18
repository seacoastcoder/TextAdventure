package org.example.enums;

public enum GameItems {

    CANDLESTICK("candlestick"),
    TABLE("table"),
    GLASS("glass"),
    MAGIC_ORB("magic orb");

    private String name;

    GameItems(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
