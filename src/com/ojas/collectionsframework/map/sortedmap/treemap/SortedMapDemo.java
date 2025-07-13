package com.ojas.collectionsframework.map.sortedmap.treemap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        // SortedMap is an interface extending the Map interface that guarantees
        // the entries to be sorted basis on the KEYS, on the basis of either
        // natural ordering or comparator

        SortedMap<String, Integer> map = new TreeMap<>((a,b) ->  (b.charAt(0) - 0) - (a.charAt(0) - 0));// The constructor can take a comparator to sort the keys
        map.put("Ojshwa", 98);
        map.put("Apeksha", 99);
        map.put("Krishna", 92);
        map.put("Rahul", 89);
        map.put("Tejashwa", 81);

//        System.out.println(map);
//
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap("Rahul")); // exclude "toKey"
//        System.out.println(map.tailMap("Rahul"));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");

        System.out.println(navigableMap);

        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(2));
        System.out.println(navigableMap.lowerEntry(3));
        System.out.println(navigableMap.pollFirstEntry());


    }
}
