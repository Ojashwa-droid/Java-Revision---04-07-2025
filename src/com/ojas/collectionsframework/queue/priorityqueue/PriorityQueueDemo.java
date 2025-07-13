package com.ojas.collectionsframework.queue.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Part of the queue interface implementation classes
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customized ordering
        // head --> the highest priority
        // does not allow null elements

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y-x));
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); // not sorted
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // Internal working
        // PriorityQueue implements min-heap for natural ordering by default

    }
}
