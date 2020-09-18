package org.example.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUserInputTest {

    ValidateUserInput validator = new ValidateUserInput();

    @Test
    public void testShouldReturnTrueWhenCommandLengthIsValid() {
        // given
        String[] commands = {"move", "South"};

        // when
        boolean validationResult = validator.validatePlayerCommandLength(commands);

        // then
        Assertions.assertTrue(validationResult);
    }

    @Test
    public void testShouldReturnFalseWhenCommandLengthIsNotValid() {
        // given
        String[] commands = {"move"};

        // when
        boolean validationResult = validator.validatePlayerCommandLength(commands);

        // then
        Assertions.assertFalse(validationResult);
    }

}