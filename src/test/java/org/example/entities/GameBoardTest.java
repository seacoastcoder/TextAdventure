package org.example.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class GameBoardTest {

    private static final String TEST_GAME_BOARD_PATH = "src/test/resources/testgame.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testJsonMappsToGameBoard() {

        // given
        GameBoard gameBoard = new GameBoard();

        // when
        try {
            gameBoard = objectMapper.readValue(new File(TEST_GAME_BOARD_PATH), GameBoard.class);
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.assertFalse(true);
        }

        // then
        Assertions.assertFalse(gameBoard.getRooms().isEmpty());
        Assertions.assertEquals(5, gameBoard.getRooms().size());
        Assertions.assertEquals(0, gameBoard.getRooms().get(1).getConnections().get(0).getNorth());
        Assertions.assertEquals(5, gameBoard.getRooms().get(1).getConnections().get(0).getSouth());

        Assertions.assertFalse(gameBoard.getItems().isEmpty());
        Assertions.assertEquals(4, gameBoard.getItems().size());
        Assertions.assertEquals("Magic Orb", gameBoard.getItems().get(3).getItemName());
    }
}