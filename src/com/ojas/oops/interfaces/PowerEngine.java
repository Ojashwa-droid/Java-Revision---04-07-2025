package com.ojas.oops.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engiene starts");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerates");

    }
}
