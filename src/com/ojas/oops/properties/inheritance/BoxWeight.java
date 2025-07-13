package com.ojas.oops.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // calls the parent class constructor to initialize the values present in the parent class
        this.weight = weight;
    }
}