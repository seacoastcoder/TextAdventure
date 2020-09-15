package org.example.utilities;

import org.example.entities.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GameDisplayScreenTest {

    @Test
    public void testRenderScreen() {
        // given
        GameBoard gameBoard = new GameBoard();

        Item itemOne = new Item();
        itemOne.setItemId(1);
        itemOne.setItemName("Test Item");

        List<Item> itemsInRoomIds = new ArrayList<>();
        itemsInRoomIds.add(itemOne);

        // items in room
        Room roomOne = new Room();
        roomOne.setDescription("You enter a room");
        roomOne.setItemsInRoom(itemsInRoomIds);

        gameBoard.getRooms().add(roomOne);

        // carried item and player
        Item itemTwo = new Item();
        itemTwo.setItemName("Carried Item");

        List<Item> itemsCarried = new ArrayList<>();
        itemsCarried.add(itemTwo);

        Player player = new Player();
        player.setItemsCarrying(itemsCarried);

        // gameboard items
        gameBoard.getItems().add(itemOne);
        gameBoard.getItems().add(itemTwo);

        // When
        GameDisplayScreen.renderScreen(gameBoard, player);
    }

    @Test
    public void testRenderRoom() {

        // given
        Player player = new Player();
        player.setCurrentRoomId(1);

        Connection connection = new Connection();
        connection.setSouth(5);
        connection.setEast(3);

        List<Connection> connections = new ArrayList<>();
        connections.add(connection);

        Room room = new Room();
        room.setRoomId(1);
        room.setConnections(connections);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room);

        GameBoard gameBoard = new GameBoard();
        gameBoard.setRooms(rooms);

        // when
        GameDisplayScreen.renderRoom(gameBoard, player);
    }

}