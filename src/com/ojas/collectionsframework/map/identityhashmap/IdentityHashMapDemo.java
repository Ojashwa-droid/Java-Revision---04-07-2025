package com.ojas.collectionsframework.map.identityhashmap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(key1, 21);
        identityHashMap.put(key2, 23);
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        // IdentityHashCode (Object class's hashcode() - plays with memory address)
        // and == operator (actual address is compared) instead of .equals() method.
        System.out.println(identityHashMap.size());
        System.out.println(identityHashMap);
    }
}