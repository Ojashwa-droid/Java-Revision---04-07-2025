package com.ojas.java8.functionalinterface.intro;

interface DefaultMethod {
    default void sayHello(){
        System.out.println("Hello ...how you doing?");
    }
}

public class DefaultMethodInInterfaceDemo implements DefaultMethod{
    public static void main(String[] args) {
        DefaultMethodInInterfaceDemo obj = new DefaultMethodInInterfaceDemo();
        obj.sayHello();

    }

    @Override
    public void sayHello() {
        System.out.println("Hello from the implementation class.");
    }
}
