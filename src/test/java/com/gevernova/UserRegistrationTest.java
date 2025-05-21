package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    //  Positive Test Cases
    @Test
    void testValidRegistration() {
        Assertions.assertDoesNotThrow(() ->
                registration.registerUser("disha", "disha@example.com", "secure123"));
    }

    @Test
    void testValidRegistrationWithDifferentInputs() {
        Assertions.assertDoesNotThrow(() ->
                registration.registerUser("john_doe", "john.doe123@mail.com", "passWord9"));
    }

    //  Negative Test Cases
    @Test
    void testInvalidUsername() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("", "test@example.com", "secure123"));
        Assertions.assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testUsernameWithOnlySpaces() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("   ", "test@example.com", "secure123"));
        Assertions.assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testNullUsername() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser(null, "test@example.com", "secure123"));
        Assertions.assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "invalidemail", "secure123"));
        Assertions.assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testEmailWithoutAtSymbol() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "email.com", "secure123"));
        Assertions.assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testNullEmail() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", null, "secure123"));
        Assertions.assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "user@example.com", "123"));
        Assertions.assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }

    @Test
    void testEmptyPassword() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "user@example.com", ""));
        Assertions.assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }

    @Test
    void testNullPassword() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser("user", "user@example.com", null));
        Assertions.assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }
}
