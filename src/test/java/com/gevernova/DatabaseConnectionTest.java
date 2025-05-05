package com.gevernova;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    public DatabaseConnectionTest() {
    }

    @BeforeEach
    void setUp() {
        this.db = new DatabaseConnection();
        this.db.connect();
    }

    @AfterEach
    void tearDown() {
        this.db.disconnected();
    }

    @Test
    void testConnectionIsEstablished() {
        Assertions.assertTrue(this.db.isConnected(), "Database should be connected");
    }

    @Test
    void testConnectionIsClosedAfterEach() {
        Assertions.assertTrue(this.db.isConnected(), "Connection should be open during the test");
    }
}
