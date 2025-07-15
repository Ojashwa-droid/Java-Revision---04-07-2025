package com.ojas.java8.functionalinterface.intro;

@FunctionalInterface
public interface MyInterface {
     void sayHello();

     default void sayBye(){
         System.out.println("Bye bye...");
     }

     static void sayGoodNight(){
         System.out.println("Good night...z..zzz");
     }
}
