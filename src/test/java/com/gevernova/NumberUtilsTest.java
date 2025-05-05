package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {
    NumberUtils utils = new NumberUtils();

    public NumberUtilsTest() {
    }

    @ParameterizedTest
    @ValueSource(
            ints = {2, 4, 6}
    )
    void testEven_withEvenNumbers(int num) {
        Assertions.assertTrue(this.utils.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(
            ints = {9, 7, 11}
    )
    void testEven_withOddNumbers(int num) {
        Assertions.assertTrue(this.utils.isEven(num));
    }
}
