package com.ojas.collectionsframework.queue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // Simulating queue via linked list

//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(1); // enqueue
//        list.addLast(2);
//        list.addLast(3);
//        System.out.println(list);
//        list.removeFirst(); // dequeue
//        System.out.println(list);

/*        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        Integer peeked = queue.peek();
        System.out.println(peeked);
        queue.remove();
        System.out.println(queue);
*/

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.size());

        System.out.println(queue.remove()); // throws an exception
        System.out.println(queue.poll());

        System.out.println(queue.element()); // throws an exception
        System.out.println(queue.peek());

    }
}
