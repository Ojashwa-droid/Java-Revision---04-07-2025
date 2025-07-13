package com.ojas.oops.staticExample;

public class StaticBlockExample {
    static int a = 10;
    static int b;

    // Will only run once when the class is being loaded for the first time
    static {
        System.out.println("I am in static block!");
        b = a + 32;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlockExample.b);
        System.out.println(StaticBlockExample.a);
    }
}
