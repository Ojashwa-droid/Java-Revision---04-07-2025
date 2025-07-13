package com.ojas.collectionsframework.map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {

        // array of same size as that of enum
        // no hashing
        // index/ordinal is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT

//        Map<Day, String> map = new HashMap<>(); Non-compliant it's better to use enum map as all the possible keys are already known to us via the enum
          Map<Day, String> map = new EnumMap<>(Day.class);
          map.put(Day.TUESDAY, "Gym");
          System.out.println(Day.TUESDAY.ordinal());

          // doesn't need hashing and uses the ordinal as the unique index from the enum (e.g. TUESDAY has ordinal 1)

    }
}

enum Day{
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
