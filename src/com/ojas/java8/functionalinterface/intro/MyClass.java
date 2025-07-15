package com.ojas.java8.functionalinterface.intro;

interface A {
    default void greetings() {
        System.out.println("Greetings from A");
    }
}

interface B {
    default void greetings() {
        System.out.println("Greetings from B");
    }
}

public class MyClass implements A, B {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.greetings();
    }

    @Override
    public void greetings() {
        A.super.greetings();
    }
}
