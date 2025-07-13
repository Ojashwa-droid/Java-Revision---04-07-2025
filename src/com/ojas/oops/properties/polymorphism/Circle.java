package com.ojas.oops.properties.polymorphism;

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area is pi * r squared!");
    }
}
