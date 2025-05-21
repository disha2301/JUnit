package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    // Positive Test Cases

    @Test
    void testDeposit() {
        account.deposit(1000.0);
        Assertions.assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testWith_SufficientBalance() {
        account.deposit(1000.0);
        boolean success = account.withDraw(500.0);
        Assertions.assertTrue(success);
        Assertions.assertEquals(500.0, account.getBalance());
    }

    // Negative Test Cases

    @Test
    void testWith_InsufficientBalance() {
        account.deposit(1000.0);
        boolean success = account.withDraw(1200.0);
        Assertions.assertFalse(success);
        Assertions.assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        account.deposit(-500.0);
        Assertions.assertEquals(0.0, account.getBalance(), "Negative deposits should be ignored");
    }

    @Test
    void testWithdrawNegativeAmount() {
        account.deposit(1000.0);
        boolean success = account.withDraw(-200.0);
        Assertions.assertFalse(success, "Should not allow withdrawal of negative amount");
        Assertions.assertEquals(1000.0, account.getBalance());
    }

    @Test
    void testWithdrawZeroAmount() {
        account.deposit(500.0);
        boolean success = account.withDraw(0.0);
        Assertions.assertFalse(success, "Should not allow withdrawal of zero amount");
        Assertions.assertEquals(500.0, account.getBalance());
    }

    @Test
    void testDepositZeroAmount() {
        account.deposit(0.0);
        Assertions.assertEquals(0.0, account.getBalance(), "Zero deposit should not change balance");
    }

    @Test
    void testGetBalance() {
        Assertions.assertEquals(0.0, account.getBalance());
    }
}
