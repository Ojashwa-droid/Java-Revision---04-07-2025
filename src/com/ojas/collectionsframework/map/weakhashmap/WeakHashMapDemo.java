package com.ojas.collectionsframework.map.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {

        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadWeakHashmap(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateAppilcationRunning();
        System.out.println("Cache after running: " + imageCache);


    }

    private static void loadWeakHashmap(Map<String, Image> imageCache) {
        String key1 = new String("img1");
        String key2 = new String("img2");
        imageCache.put(key1, new Image("Image 1"));
        imageCache.put(key2, new Image("Image 2"));
    }

    private static void simulateAppilcationRunning() {
        try {
            System.out.println("Some important application process running...");
            Thread.sleep(10000);
        }catch (Exception ignore){
            System.out.println(ignore.getMessage());
        }
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
