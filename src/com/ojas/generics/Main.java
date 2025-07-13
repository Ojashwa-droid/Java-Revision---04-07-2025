package com.ojas.generics;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
//        Box<Integer> box = new Box<>();
//        box.setValue(12);
//
////        String i = (String) box.getValue(); we get compile time error check
//
//        Integer value = box.getValue();
//        System.out.println((int) value);

         Pair<String, Integer> pair = new Pair<>("Age", 21);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        System.out.println(pair.getClass());

    }
}
