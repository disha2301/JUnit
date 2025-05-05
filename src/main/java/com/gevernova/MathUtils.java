package com.gevernova;

public class MathUtils {
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot be divide by zero");
        }
        return a / b;
    }
}
