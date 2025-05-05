package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    public UserRegistrationTest() {
    }

    @Test
    void testValidRegistration() {
        Assertions.assertDoesNotThrow(() -> this.registration.registerUser("disha", "disha@example.com", "secure123"));
    }

    @Test
    void testInvalidUsername() {
        Exception exception = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> this.registration.registerUser("", "test@example.com", "secure123"));
        Assertions.assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> this.registration.registerUser("user", "invalidemail", "secure123"));
        Assertions.assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = (Exception)Assertions.assertThrows(IllegalArgumentException.class, () -> this.registration.registerUser("user", "user@example.com", "123"));
        Assertions.assertEquals("Password must be at least 6 characters long", exception.getMessage());
    }
}
