package com.gevernova;

public class PasswordValidator {
    /**
     * Validates that the password has:
     * - At least 8 characters
     * - At least one uppercase letter
     * - At least one digit
     */
    public boolean isValid(String password){
        if(password == null || password.length() < 8){
            return false;
        }
        boolean ifUpperCase  = false;
        boolean ifDigit = false;
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)) ifUpperCase = true;
            if(Character.isDigit(ch)) ifDigit = true;
        }
        return ifUpperCase && ifDigit;
    }
}
