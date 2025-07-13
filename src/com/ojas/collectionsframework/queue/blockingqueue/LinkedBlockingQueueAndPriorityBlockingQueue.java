package com.ojas.collectionsframework.queue.blockingqueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class LinkedBlockingQueueAndPriorityBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>(11); // can pass initial capacity or default Integer.MAX_CAPACITY will be used
        // has two separate locks for enqueuing and de-queuing
        // higher concurrency

        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // internal working same as that of a priority queue (min heap array) just synchronised and can grow dynamically
        // so put doesn't need locks as the array can grow dynamically
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry"); // highest priority according to the comparator that we have provided
        System.out.println(queue2);
    }
}
