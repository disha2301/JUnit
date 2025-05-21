package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    //  Positive Test Case
    @Test
    void testValidPassword() {
        Assertions.assertTrue(validator.isValid("StrongPass1"));
    }

    //  Negative Test Cases
    @Test
    void testShortPassword() {
        Assertions.assertFalse(validator.isValid("Ab1")); // Too short
    }

    @Test
    void testNoUppercase() {
        Assertions.assertFalse(validator.isValid("strongpass1"));
    }

    @Test
    void testNoLowercase() {
        Assertions.assertFalse(validator.isValid("STRONGPASS1"));
    }

    @Test
    void testNoDigit() {
        Assertions.assertFalse(validator.isValid("StrongPass"));
    }

    @Test
    void testOnlyDigits() {
        Assertions.assertFalse(validator.isValid("12345678"));
    }

    @Test
    void testEmptyPassword() {
        Assertions.assertFalse(validator.isValid(""));
    }

    @Test
    void testNullPassword() {
        Assertions.assertFalse(validator.isValid(null));
    }

    @Test
    void testPasswordWithSpaces() {
        Assertions.assertFalse(validator.isValid("Strong Pass1")); // Contains space
    }

    @Test
    void testPasswordWithSpecialCharsOnly() {
        Assertions.assertFalse(validator.isValid("!@#$%^&*()"));
    }
}
