package com.ojas.oops.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career("Doctor");

        Daughter daughter = new Daughter(23);
        daughter.career("Lawyer");

//        Parent mom = new Parent(); you can not create an object of an abstract class
        Parent.greeting();

        Parent daughter2 = new Daughter(24);
        daughter2.partner("Thorfin", 26);
    }
}
