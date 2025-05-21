package com.gevernova;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnected();
    }

    //  Positive Tests

    @Test
    void testConnectionIsEstablished() {
        Assertions.assertTrue(db.isConnected(), "Database should be connected");
    }

    @Test
    void testMultipleConnectCalls() {
        db.connect(); // Second call should not throw error or disconnect
        Assertions.assertTrue(db.isConnected(), "Database should remain connected after repeated connect calls");
    }

    //  Negative Tests

    @Test
    void testDisconnectBeforeConnect() {
        DatabaseConnection tempDb = new DatabaseConnection();
        tempDb.disconnected(); // Disconnecting before connect
        Assertions.assertFalse(tempDb.isConnected(), "Should not be connected if disconnected before connect");
    }

    @Test
    void testOperationAfterDisconnect() {
        db.disconnected(); // Manual disconnect
        Assertions.assertFalse(db.isConnected(), "Should not be connected after manual disconnect");
        // Optionally test behavior of other methods that depend on connection
    }

    @Test
    void testNullConnectionReference() {
        DatabaseConnection tempDb = null;
        Assertions.assertThrows(NullPointerException.class, () -> tempDb.connect());
    }
}
