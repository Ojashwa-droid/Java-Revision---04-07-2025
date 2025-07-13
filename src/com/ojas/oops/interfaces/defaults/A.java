package com.ojas.oops.interfaces.defaults;

public interface A {
    void fun();

    // Default methods in interfaces were introduced to have such methods that we don't necessarily
    // need overridden implementations of by the implementing classes.
    // Without breaking the existing code we can have such method and the implementing classes can have the default behaviour.
    // This was done to evolve interfaces and to make some important design choices.
    // It allows shared logic at one place, but too much logic at one place makes it similar to abstract classes
    // it's better to avoid writing too much logic in a default method.

    default void greetings(){
        System.out.println("This is a default method in A - greetings");
    }

    // static interface method should always have a body as the static members are object independent and can not be overridden.
    static void staticGreeting(){
        System.out.println("Static greeting");
    }


}
