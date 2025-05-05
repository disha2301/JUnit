package com.gevernova;

public class DatabaseConnection {
    private boolean connected;
    public void connect(){
        System.out.println("Connected to database..");
        connected = true;
    }
    public void disconnected(){
        System.out.println("Disconnected from database..");
        connected = false;
    }
    public boolean isConnected(){
        return connected;
    }
}
