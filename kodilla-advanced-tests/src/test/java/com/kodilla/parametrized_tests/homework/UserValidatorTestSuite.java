package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aA.", "michaL"})
    public void shouldReturnTrueForCorrectUsername(String username) {
        Assertions.assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "."})
    public void shouldReturnFalseForIncorrectUsername(String username) {
        Assertions.assertFalse(userValidator.validateUsername(username));
    }
        @ParameterizedTest
        @ValueSource(strings = {"aaa@", "aaaA"})
        public void shouldReturnFalseForIncorrectEmail(String email) {
            Assertions.assertFalse(userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"michal@gmail.com", "michalggg1@gmail.com"})
    public void shouldReturnTrueForCorrectEmail(String email) {
        Assertions.assertTrue(userValidator.validateEmail(email));
    }
}

