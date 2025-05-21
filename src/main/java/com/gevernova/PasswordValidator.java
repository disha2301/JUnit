package com.gevernova;

public class PasswordValidator {
    /**
     * Validates that the password has:
     * - At least 8 characters
     * - At least one uppercase letter
     * - At least one digit
     */
    public boolean isValid(String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasUpper = false, hasLower = false, hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (Character.isWhitespace(c)) return false;
        }
        return hasUpper && hasLower && hasDigit;
    }
}