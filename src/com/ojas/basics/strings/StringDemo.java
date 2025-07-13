package com.ojas.basics.strings;

public class StringDemo {
    public static void main(String[] args) {

//        String name = "Ojashwa";
//        String name2 = "Ojashwa";
////      System.out.println(name.equals(name2));
////      System.out.println(name.equalsIgnoreCase(name2));
//
//        String str1 = "remote";
//        String str2 = "car";
//        int i = str1.compareTo(str2);
//        System.out.println(i);
//        System.out.println(name.toUpperCase());
//
//        String replace = name.replace("O", "Te").toUpperCase();
//        System.out.println(replace);
//        CharSequence charSequence = name.subSequence(2, 4);
//        System.out.println(charSequence);

//        String name = "";
//        for (int i = 0; i < 10; i++) {
//            name += "Hello ";
//        }
//        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append(" World - from Ojashwa");
        stringBuilder.delete(3, 5);
        String string = stringBuilder.toString();
        System.out.println(string);

        int[] arr = new int[10];


    }
}
