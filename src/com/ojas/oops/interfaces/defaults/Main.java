package com.ojas.oops.interfaces.defaults;

public class Main implements A, B {
    @Override
    public void greet() {
        System.out.println("Hello");
    }

   @Override
    public void fun() {
       System.out.println("Greetings ...sleepy head");

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.greetings();
        main.greet();
        main.greetings2();
        A.staticGreeting();
    }
}
