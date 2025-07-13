package com.ojas.collectionsframework.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // double-ended queue
        // insertion and deletion from both ends
        // versatile than regular queues and stacks as they support all the operations of both

        Deque<Integer> deque1 = new ArrayDeque<>(); // internally an array. faster iteration, low memory, no null allowed
        // circular, head and tail
        // no need to shit elements just shift the head and tail indexes
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25
        System.out.println(deque1);
        System.out.println("First Element: " + deque1.getFirst());
        System.out.println("Last Element: " + deque1.getLast());
        deque1.removeFirst(); // removes 5
        deque1.pollLast(); // removes 25
        for (Integer element: deque1){
            System.out.println(element);
        }


        Deque<Integer> deque2 = new LinkedList<>(); // works the same way as arraydeque but slower and less memory efficient


    }
}
