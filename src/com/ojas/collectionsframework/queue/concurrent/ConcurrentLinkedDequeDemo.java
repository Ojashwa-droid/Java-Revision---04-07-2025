package com.ojas.collectionsframework.queue.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;


public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        // non-blocking, thread-safe double ended queue
        // compare and swap strategy
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.addLast("Element2");
        System.out.println(deque);
    }
}
