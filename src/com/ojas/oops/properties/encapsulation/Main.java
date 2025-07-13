package com.ojas.oops.properties.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(21231823723l);
        System.out.println(bankAccount.getAccountNumber());
        bankAccount.deposit(130);
        bankAccount.withdraw(23);
        System.out.println(bankAccount.getBalance());
    }
}