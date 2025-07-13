package com.ojas.collectionsframework.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, .8f, true); // double linked list for order along with usual internal array
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Mango", 20);
        linkedHashMap.put("Papaya", 30);

        linkedHashMap.get("Mango"); // Follows LRU principle and puts the least recently accessed item on top to do delete operations or so
        // used in case of caching where we have to remove least recently used data from the cache

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Converting a hashmap to a linked hashmap; both are not thread safe
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap);
    }
}
