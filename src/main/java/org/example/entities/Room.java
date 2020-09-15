package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Room {

    @JsonProperty("id")
    private int roomId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("Connections")
    private List<Connection> connections;

    @JsonProperty("itemsinRoom")
    private List<Item> itemsInRoom = new ArrayList<>();

    @JsonProperty("winningItemId")
    private int winningItemId;

    @JsonProperty("winningMessage")
    private String winningMessage;

    public Room() {}

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public List<Item> getItemsInRoom() {
        return itemsInRoom;
    }

    public void setItemsInRoom(List<Item> itemsInRoom) {
        this.itemsInRoom = itemsInRoom;
    }

    public int getWinningItemId() {
        return winningItemId;
    }

    public void setWinningItemId(int winningItemId) {
        this.winningItemId = winningItemId;
    }

    public String getWinningMessage() {
        return winningMessage;
    }

    public void setWinningMessage(String winningMessage) {
        this.winningMessage = winningMessage;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                '}';
    }
}
