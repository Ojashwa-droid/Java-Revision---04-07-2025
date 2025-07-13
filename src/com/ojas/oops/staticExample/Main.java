package com.ojas.oops.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(20, "Kunal", 10000, false);
//        Human ojas = new Human(21, "Ojashwa", 15000, false);
//
//        System.out.println(Human.population);

        // If a member of a class is static then it can be accessed without creating
        // an object of that class or without referencing to it
        // as the member is static meaning it belongs to the class rather than the object.

//        Main main = new Main();
//        main.greeting();

        Main.fun();


    }

    // we know that something that is not static belongs to the object
    // therefore we have to make greeting() either static or instantiate Main class
    // and then refer to the greeting()
    void greeting(){
        System.out.println("Hello world!");
        fun2();
    }
    void fun2(){
        System.out.println("Fun2");
    }

    static void fun(){
        System.out.println("This is fun!");


        // greeting();  you can not use this because it requires an instance
        // but the function you are using it in doesn't depend upon instance
        // so how can you have something that depends on an instance inside
        // sth that is independent of an instance

        // But greeting() can be referenced from this static method after explicitly
        // mentioning an object reference to it

        Main main = new Main();
        main.greeting();

    }
}
