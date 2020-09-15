package org.example.utilities;

import org.example.entities.*;

import java.util.List;

import static org.example.constants.GameConstants.PLAYER_CARRYING_PROMPT;
import static org.example.constants.GameConstants.PLAYER_SIGHT_PROMPT;

public class GameDisplayScreen {

    public static void renderScreen(GameBoard gameBoard, Player player) {

        // Print room description
        int currentRoomId = player.getCurrentRoomId();
        Room currentRoom = gameBoard.getRooms().get(currentRoomId - 1);

        System.out.println(currentRoom.getDescription());

        // Print items player is carrying
        List<Item> playerItems = player.getItemsCarrying();
        playerItems.forEach(item -> System.out.println(PLAYER_CARRYING_PROMPT + item.getItemName()));

        // Print items spotted in room
        List<Item> gameItems = gameBoard.getItems();
        List<Item> itemsInRoomIds = currentRoom.getItemsInRoom();

        itemsInRoomIds.forEach(itemRef -> {
            System.out.println(PLAYER_SIGHT_PROMPT + gameItems.get(itemRef.getItemId() - 1).getItemName());
        });

    }

    public static void renderRoom(GameBoard gameBoard, Player player) {

        // Use player's current position to determine room connections
        int currentRoomId = player.getCurrentRoomId();
        Room currentRoom = gameBoard.getRooms().get(currentRoomId - 1);

        Connection availableConnections = currentRoom.getConnections().get(0);

        // render top border and doors
        if (availableConnections.getNorth() == 0) {
            System.out.println("+------------+");
        } else {
            System.out.println("+----    ----+");
        }

        // render sides and doors
        System.out.println("|            |");

        if (availableConnections.getWest() != 0 && availableConnections.getEast() == 0) {
            System.out.println("             |");
        } else if (availableConnections.getWest() == 0 && availableConnections.getEast() != 0) {
            System.out.println("|             ");
        } else if (availableConnections.getWest() != 0 && availableConnections.getEast() != 0) {
            System.out.println("              ");
        } else {
            System.out.println("|            |");
        }

        System.out.println("|            |");

        // render lower border and doors
        if (availableConnections.getSouth() == 0) {
            System.out.println("+------------+");
        } else {
            System.out.println("+----    ----+");
        }
    }
}
