package com.ojas.oops.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the Box class!");
    }

}
