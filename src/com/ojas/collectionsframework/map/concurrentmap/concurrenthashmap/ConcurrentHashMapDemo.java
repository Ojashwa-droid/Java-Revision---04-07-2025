package com.ojas.collectionsframework.map.concurrentmap.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // Java 7 --> segment based locking --> 16 segments (smaller hashmaps)
        // Only segment being accessed (written to or read from) is locked and rest are left untouched
        // Read: does not require locking unless there is a write operation going on the same segment
        // Write: Requires locking on the segment being written to

        // Java 8 --> no segment based locking approach
        //        --> compare-and-swap approach --> no locking unless resizing or collision
        // Thread A last saw --> x = 42
        // Thread A task --> x to 50
        // If x is 42 change it to 50 else don't change it and retry


        // P.S. rest of the methods are the same as normal maps like put() get() etc


        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
    }
}
