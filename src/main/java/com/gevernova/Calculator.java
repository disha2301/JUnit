package com.gevernova;

public class Calculator {

    // Returns sum of a and b
    public int add(int a, int b){
        return a + b;
    }

    // Returns difference of a and b
    public int subtract(int a, int b){
        return a - b;
    }

    // Returns product of a and b
    public int multiply(int a, int b){
        return a * b;
    }

    // Returns quotient of a divided by b; throws if b is zero
    public int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot be divided by zero");
        }
        return a / b;
    }
}
