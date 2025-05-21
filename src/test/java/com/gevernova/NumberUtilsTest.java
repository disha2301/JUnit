package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {
    NumberUtils utils = new NumberUtils();

    // Positive test cases: inputs that should return true for isEven()
    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, -2, -8, 1000})
    void testEven_withEvenNumbers(int num) {
        Assertions.assertTrue(utils.isEven(num));
    }

    // Negative test cases: inputs that should return false for isEven()
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, -1, -7, 999})
    void testEven_withOddNumbers(int num) {
        Assertions.assertFalse(utils.isEven(num));
    }
}
