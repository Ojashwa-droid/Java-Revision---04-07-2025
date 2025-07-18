package com.ojas.basics.strings;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // Jagged array
        /*
         * a, b, c
         * d, e
         * f, g, h, i
         *
         * */

//        int[][] charArray = {
//                {'a','b','c'},
//                {'d', 'e'},
//                {'f', 'g', 'h', 'i'}
//        };
//
//        System.out.println("The array is: ");
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = 0; j < charArray[i].length; j++) {
//                System.out.print(charArray[i][j]  + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(Arrays.toString(charArray[i]));
//        }

//        int[] array = {1, 3, 23, 9, 18};
        char[] charArray = {'a', 'b', 'c', 'd'};
        ArrayDemo.reverseArray(charArray);
        System.out.println(Arrays.toString(charArray));

    }

    public static void reverseArray(char[] array) {
        // We can have two pointers start and end
        int start = 0;
        int end = array.length - 1; // last index of the array

        while (start < end) {
            char temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
        }

    }
}
