package org.example.enums;

public enum GameActions {

    DROP("drop"),
    GET("get"),
    MOVE("move");

    private String name;

    GameActions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
