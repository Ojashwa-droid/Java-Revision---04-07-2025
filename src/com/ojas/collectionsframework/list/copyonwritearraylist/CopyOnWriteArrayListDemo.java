package com.ojas.collectionsframework.list.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // "Copy on write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the existing list is made and the modification is applied to that copy
        // this allows reading operation of the list while it's being modified remain unchanged

        // Read Operation: Fast and direct, since they happen on a stable list without interference from modification
        // Write Operation: A new copy of the list is created for every modification
        //                   The reference to the list is then updated to the newly created and modified list for the subsequent reads

        List<String> shopingList = new CopyOnWriteArrayList<>();
        shopingList.add("Milk");
        shopingList.add("Eggs");
        shopingList.add("Butter");

        for (String item : shopingList) {
            System.out.println(item);
            if (item.equals("Eggs")) {
                shopingList.add("Beans");
                System.out.println("Added Beans while reading!");
            }
        }

        // old = new
        // And its single threaded
        System.out.println("Updated shopping list: " + shopingList);


    }
}
