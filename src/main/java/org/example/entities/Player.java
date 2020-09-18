package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Item> itemsCarrying = new ArrayList<>();
    private int currentRoomId = 1;

    public Player() {

    }

    public void pickupItem(int itemId, GameBoard gameBoard) {

    }

    public void dropItem(int itemId, GameBoard gameBoard) {

    }

    public List<Item> getItemsCarrying() {
        return itemsCarrying;
    }

    public void setItemsCarrying(List<Item> itemsCarrying) {
        this.itemsCarrying = itemsCarrying;
    }

    public int getCurrentRoomId() {
        return currentRoomId;
    }

    public void setCurrentRoomId(int currentRoomId) {
        this.currentRoomId = currentRoomId;
    }
}
