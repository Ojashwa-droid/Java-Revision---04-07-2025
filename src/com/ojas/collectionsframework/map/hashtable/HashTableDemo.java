package com.ojas.collectionsframework.map.hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) throws Exception{
        // Implementation class of Map interface
        // Synchronised - thread safe
        // Now ConcurrentHashMap is used instead of this (a legacy class)
        // Synchronisation overhead - performance slower than HashMap
        // All methods are synchronised even read operations --> con
        // Only linked-list in case of collision
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
//        System.out.println(hashtable);
//        System.out.println("Value for key 2: " + hashtable.get(2));
//        System.out.println(hashtable.containsValue("Rohan"));
//        hashtable.remove(1);
//        System.out.println(hashtable);

//        hashtable.put(null, "Null Key"); // Throws exception
//        hashtable.put(4, null); // Throws exception


        // Example of concurrency in hashmaps

//        HashMap<Integer, String> map = new HashMap<>();
        Hashtable<Integer, String> map = new Hashtable<>();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++){
                map.put(i, "Thread1");
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1000; i < 2000; i++){
                map.put(i, "Thread1");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final size of the map: " + map.size());
    }
}
