package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class GameBoard {

    @JsonProperty("Rooms")
    private List<Room> rooms = new ArrayList<>();

    @JsonProperty("Items")
    private List<Item> items = new ArrayList<>();

    public GameBoard() {}

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
