package com.ojas.java8.functionalinterface.intro.staticmethods;

interface A {
    static void greet() {
        System.out.println("Hi from A");
    }

    default void defaultGreetings(){
        System.out.println("Greetings from A");
    }
}


public class StaticInsideInterfaceDemo implements A{
    public static void main(String[] args) {
        StaticInsideInterfaceDemo obj = new StaticInsideInterfaceDemo();
        obj.defaultGreetings();
        // can only access default methods as those methods can be overridden
        // and not the static methods which are object independent
        A.greet(); // invoked by the interface
        StaticInsideInterfaceDemo.greet();
    }

    static void greet() {
        System.out.println("Hi from the implementation class");
    }
}
