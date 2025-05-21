package com.gevernova;

public class MathUtils {

    // Divides a by b; throws ArithmeticException if b is zero
    public int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
