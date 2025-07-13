package com.ojas.generics.methods;

public class Main {
    public static void main(String[] args) {

        Main.printArray(new String[]{"1 is one", "2 is two", "3 is three", "4 ka pata nhi", "5 kon bhai?"});
        Main.printArray(new Integer[]{1,2,4,5,6});
    }

    public static <T> void printArray(T[] array){
        for (T element: array) {
            System.out.println(element);
        }
    }
}
