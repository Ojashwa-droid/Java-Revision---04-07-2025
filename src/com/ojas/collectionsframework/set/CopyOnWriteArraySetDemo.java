package com.ojas.collectionsframework.set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-safe
        // Copy on write mechanism
        // No duplicate elements
        // Iterators do not reflect modifications

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet: ");
        for (int i: copyOnWriteArraySet){
            System.out.println("Reading from CopyOnWriteArraySet: " + i);
            copyOnWriteArraySet.add(6);
        }

        System.out.println("Final CopyOnWriteArraySet: " + copyOnWriteArraySet);

        System.out.println("\nIterating and modifying ConcurrentSkipListSet: ");
        for (int i: concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipListSet: " + i);
            concurrentSkipListSet.add(6);
        }

        System.out.println("Final ConcurrentSkipListSet: " + concurrentSkipListSet);


    }
}
