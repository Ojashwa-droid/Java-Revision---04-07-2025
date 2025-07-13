package com.ojas.generics;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {


        // To avoid type casting and type checking issues at compile time streams were introduced in java 5
        ArrayList<String> list = new ArrayList<>();
        list.add("Ojashwa Tripathi");
        list.add("Krishna Singh");
        list.add("Tejashwa Tripathi");

        for (String name: list){
            System.out.println(name);
        }

    }
}
