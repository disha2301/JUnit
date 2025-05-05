package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    public TemperatureConverterTest() {
    }

    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals((double)32.0F, this.converter.celsiusToFahrenheit((double)0.0F), 0.001);
        Assertions.assertEquals((double)212.0F, this.converter.celsiusToFahrenheit((double)100.0F), 0.001);
        Assertions.assertEquals(98.6, this.converter.celsiusToFahrenheit((double)37.0F), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        Assertions.assertEquals((double)0.0F, this.converter.fahrenheitToCelsius((double)32.0F), 0.001);
        Assertions.assertEquals((double)100.0F, this.converter.fahrenheitToCelsius((double)212.0F), 0.001);
        Assertions.assertEquals((double)37.0F, this.converter.fahrenheitToCelsius(98.6), 0.001);
    }
}
