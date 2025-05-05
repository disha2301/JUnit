package com.gevernova;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceUtilsTest {
    PerformanceUtils utils = new PerformanceUtils();

    public PerformanceUtilsTest() {
    }

    @Test
    @Timeout(
            value = 2L,
            unit = TimeUnit.SECONDS
    )
    void testLongRunningTask_Performance() {
        String result = this.utils.longRunningTask();
        Assertions.assertEquals("Completed", result);
    }
}
