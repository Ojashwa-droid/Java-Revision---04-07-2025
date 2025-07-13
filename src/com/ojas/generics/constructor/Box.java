package com.ojas.generics.constructor;

// GENERIC CONSTRUCTORS (without the class being a generic type)

public class Box {

    private Number value;

    public <T extends Number> Box(T value){
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box box = new Box(20);
        System.out.println(box.getValue());



    }

}
