package com.ojas.exceptions;

public class InsufficientFundException extends Exception {
    private double amount;

    public InsufficientFundException() {
        super("what do you want you don't have enough money");
    }

    public InsufficientFundException(double amount) {
        super("What do you want you don't have enough money, you only have: " + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
