package com.ojas.generics;

public class BoxxDemo {
    public static void main(String[] args) {
        PrintableImpl item = new PrintableImpl(200);
        Boxx<PrintableImpl> boxx = new Boxx<>(item);
        boxx.sayHello();

    }
}
