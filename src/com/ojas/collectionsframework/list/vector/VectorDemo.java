package com.ojas.collectionsframework.list.vector;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(2);
        System.out.println(vector.capacity());

        LinkedList<String> linkedList = new LinkedList<>(List.of("I", "Me", "Myself"));
        Vector<String> strings = new Vector<>(linkedList);
        System.out.println(strings);
        linkedList.isEmpty();
        System.out.println(strings.isEmpty());

    }
}
