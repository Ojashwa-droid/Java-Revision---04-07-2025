package com.ojas.collectionsframework.list.arraylist;

import java.util.*;

class MyComparator implements Comparator<Integer> {

    // if this method returns +ive then o1 comes later than o2
    // if it returns 0 then both objects have same order
    // if it returns -ve then o1 comes before o2

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

class MyStringLengthComparator implements Comparator<String> {

    // if this method returns +ive then o1 comes later than o2
    // if it returns 0 then both objects have same order
    // if it returns -ve then o1 comes before o2

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(11);

//        System.out.println(list.getClass().getName());
//        System.out.println(list.size());
        list.add(12); // 0
        list.add(10); // 1
        list.add(-178); // 2
        list.add(120); // 3

//        list.set(2, -69);
//        System.out.println(list); // internally implements toString() method
//
//
//        list.remove(1);
//        System.out.println(list);


//        List<String> listString = Arrays.asList("Ojashwa", "Tejashwa", "Nisha", "Ram Charit Tripathi");
//
//        Integer[] arr = {1,3,4,53,3423};
//        List<Integer> list1 = Arrays.asList(arr);
//        System.out.println(list1.getClass().getName());
//
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        list.add(212);
//        list2.set(0, -1);
//        System.out.println(list2);
//
//        List<Integer> integers = List.of(1, 2, 3, 4, 4, 5);
//        System.out.println(integers.getClass().getName());
//        ArrayList<Integer> list3 = new ArrayList<>(integers);
//        list3.add(12);
//        System.out.println(list3);

//
//        List<Integer> integers2 = List.of(1, 2, 34, 4, 56, 67); // an unmodifiable list
//        list.addAll(integers2);
//        System.out.println(list);
//
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Date");
//
//        fruits.remove(1);
//        list.remove(Integer.valueOf(12));
//        System.out.println(fruits);
//        System.out.println(list);

//        Integer[] array = list.toArray(new Integer[0]);
//        System.out.println(array[0]);

        /// +-------SORTING IN COLLECTIONS--------+ ///

        // Sorting the collections using the static sort() method within the Collection interface
        /*Collections.sort(fruits);
        System.out.println(fruits);

        Collections.sort(list);
        System.out.println(list);*/

        // list.sort() takes a comparator(compares two objects of same type) as an argument
//        list.sort(null); // default order is ascending order
//        System.out.println(list);

//        list.sort(new MyComparator());
//        System.out.println(list);

        fruits.sort(new MyStringLengthComparator());
        System.out.println(fruits);

        // OR WE CAN SIMPLY USE LAMBDA EXPRESSION TO DO THE SAME TASK

        fruits.sort((a, b)-> (b.length() - a.length())); // logic remains the same just done using the lambda expression
        System.out.println(fruits);





/*        System.out.println(list.get(0));
        System.out.println(list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("+----Using For Each Loop----+");
        for (Integer element: list){
            System.out.println(element);
        }

        System.out.println(list.contains(40));
        System.out.println(list.contains(-178));

        list.remove(1);
        for (Integer element: list){
            System.out.println(element);
        }

        list.add(2, 69);
        for (int x : list){
            System.out.println(x);
        }

*/

    }
}
