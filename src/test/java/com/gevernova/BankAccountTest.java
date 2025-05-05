package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    public BankAccountTest() {
    }

    @BeforeEach
    void setUp() {
        this.account = new BankAccount();
    }

    @Test
    void testDeposit() {
        this.account.deposit((double)1000.0F);
        Assertions.assertEquals((double)1000.0F, this.account.getBalance());
    }

    @Test
    void testWith_SufficientBalance() {
        this.account.deposit((double)1000.0F);
        boolean success = this.account.withDraw((double)500.0F);
        Assertions.assertTrue(success);
        Assertions.assertEquals((double)500.0F, this.account.getBalance());
    }

    @Test
    void testWith_InsufficientBalance() {
        this.account.deposit((double)1000.0F);
        boolean success = this.account.withDraw((double)1200.0F);
        Assertions.assertFalse(success);
        Assertions.assertEquals((double)300.0F, this.account.getBalance());
    }

    @Test
    void testGetBalance() {
        Assertions.assertEquals((double)0.0F, this.account.getBalance());
    }
}
