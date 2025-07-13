package com.ojas.collectionsframework.map.weakhashmap;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Realme", "X3 SuperZoom"));
        System.out.println(weakReference.get());
        System.gc(); // we can only suggest the gc to run and its now up to GC to run
        try {
            Thread.sleep(10000);
        } catch (Exception ignore) {
        }
        System.out.println(weakReference.get());
    }
}

class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

