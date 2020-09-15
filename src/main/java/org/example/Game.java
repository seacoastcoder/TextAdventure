package org.example;

import org.example.entities.GameBoard;
import org.example.entities.Player;
import org.example.utilities.GameDisplayScreen;
import org.example.validation.ValidateGameInput;

import java.io.File;
import java.util.Scanner;

import static org.example.constants.GameConstants.PLAYER_ACTION_PROMPT;

public class Game {

    private GameBoard gameBoard;
    private Player player;

    public Game(GameBoard gameBoard, Player player) {
        this.gameBoard = gameBoard;
        this.player = player;
    }

    public void startGame() {
        // Initial setup
        Scanner input = new Scanner(System.in);

        // Game loop
        while(true) {

            // Display Screen
            GameDisplayScreen.renderScreen(gameBoard, player);
            GameDisplayScreen.renderRoom(gameBoard, player);

            // Prompt user
            System.out.print(PLAYER_ACTION_PROMPT);
            while (input.hasNextLine()) {
                System.out.println(input.next());
            }
        }
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
