package com.ojas.collectionsframework.set;

import com.ojas.enums.part1.Day;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        // Sets can not contain duplicate values, it's basically nothing but collection of keys of Map collection
        // Internal working same as that of Map
        // Faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

/*
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = map.keySet(); // Basically, sets are nothing but collection of keys from maps and hence follow same principles
*/
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new LinkedHashSet<>();
        NavigableSet<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(-67);
        set3.add(78);
        System.out.println(set3);
        System.out.println("Does it have element 2? " + set3.contains(2));
        for (int i : set3) {
            System.out.println("element: " + i);
        }


        // Thread Safety

//        Set<Integer> integers = Collections.synchronizedSet(set3); // this new set "integers" is now thread safe and "set3" is still un-synchronized
//        But it's not recommended as it has no performance at all
//        The set gets wrapped around a synchronized block that blocks other thread while one is working on it

        // Preferred

        ConcurrentSkipListSet<Integer> set4 = new ConcurrentSkipListSet<>(); // similar working as that of ConcurrentSkipListMap
        Set<Integer> set5 = new ConcurrentSkipListSet<>();

        // unmodifiable

        Set<Integer> integers = Set.of(1, 2, 3, 4, 55, 6, 754, 4565, 65, 435, 45, 34543, 5345, 43);// not limited to 10 elements like in Map.of(...elements)
        Collections.unmodifiableSet(set4);

    }
}
