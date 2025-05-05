package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    public PasswordValidatorTest() {
    }

    @Test
    void testValidPassword() {
        Assertions.assertTrue(this.validator.isValid("StrongPass1"));
    }

    @Test
    void testShortPassword() {
        Assertions.assertFalse(this.validator.isValid("Ab1"));
    }

    @Test
    void testNoUppercase() {
        Assertions.assertFalse(this.validator.isValid("strongpass1"));
    }

    @Test
    void testNoDigit() {
        Assertions.assertFalse(this.validator.isValid("StrongPass"));
    }

    @Test
    void testNullPassword() {
        Assertions.assertFalse(this.validator.isValid((String)null));
    }
}
