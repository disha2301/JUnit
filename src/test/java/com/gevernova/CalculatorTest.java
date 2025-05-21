package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    // Positive Test Cases
    @Test
    void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, calculator.divide(6, 3));
    }

    // Negative Test Cases

    @Test
    void testDivideByZero() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        Assertions.assertEquals("Cannot divide by zero ", exception.getMessage());
    }

    @Test
    void testAddWithNegativeNumbers() {
        Assertions.assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    void testSubtractWithNegativeNumbers() {
        Assertions.assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    void testMultiplyByZero() {
        Assertions.assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void testLargeNumberAddition() {
        Assertions.assertEquals(2_000_000_000, calculator.add(1_000_000_000, 1_000_000_000));
    }

    @Test
    void testIntegerDivisionTruncation() {
        Assertions.assertEquals(2, calculator.divide(5, 2)); // Expected truncation from 2.5
    }
}
