package com.ojas.collectionsframework.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > this.capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Ojashwa", 98);
        studentMap.put("Tejashwa", 80);
        studentMap.put("Vipul", 79);
        System.out.println(studentMap);
        studentMap.put("Rohini", 99);
        System.out.println(studentMap);
    }
}
