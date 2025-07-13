package com.ojas.oops.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;

    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }

    static void message(){
//        System.out.println("Hello " + this.name);
         //you cannot use "this" here
        // a nonstatic member can not be referenced from a static context
    }
}
