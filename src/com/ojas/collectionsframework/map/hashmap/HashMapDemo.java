package com.ojas.collectionsframework.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(17, 0.5f);
        // default size of the internal array is 16 and load-factor is 0.75
        map.put(11, "Ojashwa");
        map.put(2, "Neha");
        map.put(3, "Shubham");
        System.out.println(map);

        String student = map.get(2);
        System.out.println(student);

        String s = map.get(23);
        System.out.println(s);

        System.out.println(map.containsKey(45)); // O(1) time complexity
        System.out.println(map.containsValue("Shubham"));

        Set<Integer> keys = map.keySet();
        for (Integer key: keys){
            System.out.println(map.get(key));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(map);
    }
}
