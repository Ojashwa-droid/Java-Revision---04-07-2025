package com.ojas.exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance){
            throw new InsufficientFundException(amount);
        }
        balance -= amount;
    }
}
