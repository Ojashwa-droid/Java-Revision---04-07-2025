package com.ojas.collectionsframework.map.immutablemap;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Monday", 1);
        map1.put("Tuesday", 2);
        System.out.println(map1);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("B", 32); throws exception

        Map<String, Integer> map3 = Map.of("A", 1, "B", 2); // returns an unmodifiable map of two key value pairs (limited to only 10 entries)
//        map3.put("3", 3);
        System.out.println(map3);

        Map<String, Integer> map4 = Map.ofEntries(Map.entry("A", 12), Map.entry("Z", 23));
        System.out.println(map4);
    }
}
