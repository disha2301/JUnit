package com.gevernova;

public class BankAccount {
    private double balance;

    // deposit method: Adds more to the balance
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    // withdraw method: Reduces balance is sufficient funds exists
    public boolean withDraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
    // returns the current account balance
    public double getBalance(){
        return balance;
    }


}
