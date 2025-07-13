package com.ojas.oops.interfaces.defaults;

public interface B {
    void greet();

    default void greetings2(){
        System.out.println("Default method in B - greetings2");
    }
}
