package org.example;

import org.example.entities.GameBoard;
import org.example.entities.Player;
import org.example.utilities.GameDisplayScreen;
import org.example.validation.ValidateGameInput;
import org.example.validation.ValidateUserInput;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

import static org.example.constants.GameConstants.PLAYER_ACTION_PROMPT;

public class Game {

    private GameBoard gameBoard;
    private Player player;

    public Game(GameBoard gameBoard, Player player) {
        this.gameBoard = gameBoard;
        this.player = player;
    }

    public void startGame() {

        // Initialize scanner for getting user input
        Scanner input = new Scanner(System.in);

        // Game loop
        while(true) {

            // Display screen
            GameDisplayScreen.renderScreen(gameBoard, player);
            GameDisplayScreen.renderRoom(gameBoard, player);

            // User input loop
            while(true) {

                // Prompt user
                System.out.print(PLAYER_ACTION_PROMPT);
                String playerInput = input.nextLine();

                // Force uppercase
                playerInput = playerInput.toUpperCase();

                // Split command into two parts (Action and Direction / Item)
                String[] playerInputParts = playerInput.split(" ", 2);
                System.out.println(Arrays.toString(playerInputParts));

                // Validate user command length
                if (!ValidateUserInput.validatePlayerCommandLength(playerInputParts))
                    continue;

                //String[] parsedCommands = concatenateForItemsWithSpaces(playerInputParts);




                System.out.println(playerInputParts[0] + " " + playerInputParts[1]);
            }

            // TODO: Drop / pickup item or move player
        }
    }

    // only time there are more than two commands, is when there is an multi-word item
    private String[] concatenateForItemsWithSpaces(String[] playerInputParts) {
        String[] concatenatedCommands = new String[2];

        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i < playerInputParts.length; i++) {
            joiner.add(playerInputParts[i]);
        }

        concatenatedCommands[0] = playerInputParts[0];
        concatenatedCommands[1] = joiner.toString();

        return concatenatedCommands;
    }

    public static void main(String[] args) {

        // Initialize gameboard and player
        File gameBoardFile = ValidateGameInput.validateGameBoardFile(args);
        GameBoard gameBoard = ValidateGameInput.validateGameBoard(gameBoardFile);

        Player player = new Player();

        // Start the game
        Game game = new Game(gameBoard, player);
        game.startGame();
    }

}
