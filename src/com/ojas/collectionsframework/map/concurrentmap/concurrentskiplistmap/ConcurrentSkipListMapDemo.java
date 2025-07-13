package com.ojas.collectionsframework.map.concurrentmap.concurrentskiplistmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("Banana", 5);
        map.put("Apple", 2);
        System.out.println(map.getClass().getName());
        System.out.println(map.get("Apple"));
        System.out.println(map);

        ConcurrentSkipListMap<String, Integer> clone = map.clone();
        clone.put("Apple", 4);
        System.out.println(clone.get("Apple"));

        System.out.println(map.firstEntry());


    }
}
