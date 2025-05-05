package com.gevernova;

public class UserRegistration {
    // Method to register a user
    public void registerUser(String username, String email, String password) {
        // Check if any field is null or empty
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }

        // Registration logic (skipped for simplicity)
        System.out.println("User registered: " + username);
    }
}
