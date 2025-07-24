package com.ojas.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int x : list) {
//            System.out.println(x);
//        }
//
//        /* Internally this happens when we use for each loop */
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

//        for (Integer number: numbers){
//            if (number % 2 == 0){
//                numbers.remove(number);
//            }
//        } The issue here is that the reference gets updated after the loop.

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer next = itr.next();
            if (next % 2 == 0) {
                itr.remove(); // The object gets removed while reading/iterating the object; without throwing an exception.
            }
        }
        System.out.println(numbers);
    }
}
