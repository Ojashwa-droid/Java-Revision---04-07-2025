package com.ojas.collectionsframework.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(113);
        linkedList.add(-78);
        linkedList.add(8);
        linkedList.add(7);
//        System.out.println(linkedList.get(2)); // O(n)

        linkedList.addLast(41);
        linkedList.addFirst(-301);
//        System.out.println(linkedList);

        linkedList.getFirst();
        linkedList.getLast();

        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Lion", "Cat"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

        linkedList.sort((a, b) -> (b-a));
        System.out.println(linkedList);

    }
}
