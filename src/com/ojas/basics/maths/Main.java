package com.ojas.basics.maths;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int c = -2;
        int abs = Math.abs(c);
        System.out.println(Math.sqrt(Math.abs(c)));
        System.out.println(Math.abs(1.234));
        System.out.println(Math.ceil(1.23));
        System.out.println(Math.floor(2355.34));
        System.out.println(Math.random());
    }

//    private static int max(int a, int b){
//        return (a > b) ? a : b;
//    }
}
