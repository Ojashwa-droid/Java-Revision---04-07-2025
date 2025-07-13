package com.ojas.oops.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops");

    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerates");

    }
}
