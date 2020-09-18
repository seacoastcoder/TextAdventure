package org.example.enums;

public enum GameDirections {

    NORTH("north"),
    SOUTH("south"),
    EAST("east"),
    WEST("west");

    private String name;

    GameDirections(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
