package org.example.validation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.GameBoard;

import java.io.File;

import static org.example.constants.GameConstants.GAME_RESOURCE_PATH;

public class ValidateGameInput {

    public static File validateGameBoardFile(String[] commandLineArguments) {

        if (commandLineArguments.length != 1)
            throw new IllegalArgumentException("You must provide a proper JSON file name as an argument");

        String fileName = commandLineArguments[0];
        if (!fileName.endsWith(".json"))
            throw new IllegalArgumentException("You must enter a proper JSON filename, including .json extension");

        File gameBoardFile = new File(GAME_RESOURCE_PATH + fileName);

        if (!gameBoardFile.exists())
            throw new IllegalArgumentException("No file found, you must place a corresponding JSON file in the gameboards directory, under resources");

        return gameBoardFile;
    }

    public static GameBoard validateGameBoard(File gameBoardFile) {

        ObjectMapper objectMapper = new ObjectMapper();
        GameBoard gameBoard = new GameBoard();

        try {
            gameBoard = objectMapper.readValue(gameBoardFile, GameBoard.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("You must submit a valid gameboard");
        }

        return gameBoard;
    }
}
