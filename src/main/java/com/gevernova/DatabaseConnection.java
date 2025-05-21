package com.gevernova;

public class DatabaseConnection {
    private boolean connected;

    // Establishes a connection to the database
    public void connect(){
        System.out.println("Connected to database..");
        connected = true;
    }

    // Closes the database connection
    public void disconnected(){
        System.out.println("Disconnected from database..");
        connected = false;
    }

    // Returns true if connected to the database, false otherwise
    public boolean isConnected(){
        return connected;
    }
}
