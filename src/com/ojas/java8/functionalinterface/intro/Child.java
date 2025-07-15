package com.ojas.java8.functionalinterface.intro;

@FunctionalInterface
public interface Child extends Parent {
        void sayHello();

        default void sayHi(){
            System.out.println("Hi");
        }

    static String sayHii(){
        return "Hi";
    }
}
