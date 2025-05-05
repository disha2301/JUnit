package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    CalculatorTest() {
    }

    @Test
    void testAdd() {
        Assertions.assertEquals(5, this.calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(1, this.calculator.subtract(4, 3));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(6, this.calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, this.calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = (Exception)Assertions.assertThrows(ArithmeticException.class, () -> this.calculator.divide(5, 0));
        Assertions.assertEquals("Cannot divide by zero ", exception.getMessage());
    }
}
