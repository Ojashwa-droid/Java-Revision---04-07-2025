package com.ojas.generics;

interface Printable{
    void print();
}

public class PrintableImpl extends Number implements Printable{

    private final int value;

    public PrintableImpl(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My number: " + value);

    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return Long.valueOf(value);
    }

    @Override
    public float floatValue() {
        return Float.valueOf(value);
    }

    @Override
    public double doubleValue() {
        return Double.valueOf(value);
    }
}

class Boxx<T extends Number & Printable>{

    private T value;

    public Boxx(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void sayHello(){
        System.out.print("Boxx says hello with number = ");
        value.print();
    }
}
