package com.gevernova;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    public MathUtilsTest() {
    }

    @Test
    void testDivide_ValidInput() {
        MathUtils mathUtils = new MathUtils();
        Assertions.assertEquals(5, mathUtils.divide(10, 2));
    }

    @Test
    void testDivide_ThrowsExcetion() {
        MathUtils mathUtils = new MathUtils();
        ArithmeticException exception = (ArithmeticException)Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }
}
