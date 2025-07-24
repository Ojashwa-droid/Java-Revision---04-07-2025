package com.ojas.exceptions;

public class Main {
    public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount(10);
        try {
            bankAccount.withdraw(11);
        } catch (InsufficientFundException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getAmount());
        }
    }
}
