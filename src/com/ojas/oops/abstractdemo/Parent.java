package com.ojas.oops.abstractdemo;

public abstract class Parent {

    int age = 0;

    protected Parent(int age) {
        this.age = age;
    }

    static void greeting(){
        System.out.println("Hi, what's up buddy .... how you doing?");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
}
