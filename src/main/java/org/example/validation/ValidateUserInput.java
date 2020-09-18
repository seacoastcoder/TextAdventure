package org.example.validation;

import java.util.Map;

import static org.example.constants.GameConstants.*;

public class ValidateUserInput {

    public static boolean validatePlayerCommandLength(String[] playerInputParts) {
        if (playerInputParts.length < MIN_COMMAND_LENGTH) {
            printInvalidUserInput(String.format("You must have at-least %s commands.", MIN_COMMAND_LENGTH));
            return false;
        }
        return true;
    }

    public static boolean validatePlayerAction(String[] playerInputParts, Map<String, String> availableActions) {

        return true;
    }

    // Prints a consistent format for all invalid player commands
    private static void printInvalidUserInput(String errorMessage) {
        System.out.println(INVALID_COMMAND_INDICATOR + errorMessage);
    }

}
