package com.ojas.basics.operators;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int i = a << 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i >> 1));

        System.out.printf(Locale.CHINA, "Locale chinese: %d", a);

    }
}
