package com.ojas.generics.wildcards;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<Double> list = new ArrayList<>();
        list.add(22.0);
        list.add(789.98);
        main.printArrayList(list);


    }

    public void printArrayList(ArrayList<? extends Number> list){
        for (Number obj: list){
            System.out.println(obj);
        }
    }
}
