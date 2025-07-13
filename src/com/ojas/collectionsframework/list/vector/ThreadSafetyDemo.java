package com.ojas.collectionsframework.list.vector;

import java.util.Vector;

public class ThreadSafetyDemo {
    public static void main(String[] args) throws InterruptedException {
/*        ArrayList<Integer> arrayList = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(arrayList.size());
      // ArrayList is not thread safe meaning it's not synchronized

*/

        Vector<Integer> vector = new Vector<>();
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(vector.size()); // Vector is completely thread safe
    }
}
