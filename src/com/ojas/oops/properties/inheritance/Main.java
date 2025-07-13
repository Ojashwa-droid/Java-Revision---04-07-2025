package com.ojas.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(1,2, 3);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);

//        BoxWeight box2 = new BoxWeight();
//        System.out.println(box2.h + " " + box2.weight);

        Box box3 = new BoxWeight(2, 3, 4, 5);
        System.out.println(box3.l);


    }
}
