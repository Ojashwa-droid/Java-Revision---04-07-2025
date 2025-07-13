package com.ojas.oops.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        int price = Engine.PRICE;
//        System.out.println(price);
//        car.accelerate();
//        car.start();
//        car.brake();
//        car.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();

        niceCar.upgradeEngine(new ElectricEngine());
        niceCar.start();
    }
}
