package com.ojas.generics.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException(123444423);
        } catch (MyException e) {
            System.out.println(e.fillInStackTrace());
        }


        try {
            throw new MyException("String ojashwa");
        } catch (MyException e) {
            System.out.println(e.fillInStackTrace());
        }

        try {
            throw new MyException("String Exception", 123);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
