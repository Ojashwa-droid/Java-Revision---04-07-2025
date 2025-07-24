package com.ojas.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<String> namesList = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Raghuvanshi", "Anamika", "Nisha", "Apeksha");
        List<Integer> integersList = Arrays.asList(1, 23, 345, 543, 34, 2, 80);


        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();
        // Q1: From a list of names, collect only names starting with "S" into a List.
        namesList.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
        // Q2: From a list of duplicate cities, collect unique cities into a Set.
        List<String> cities = Arrays.asList("Allahabad", "Delhi", "Sonipat", "Allahabad", "Lucknow", "Sonipat");
        System.out.println(cities.stream().distinct().collect(Collectors.toSet()));


        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));
        // Q1: Print every item in a list with "->" prefix using forEach().
        namesList.stream().forEach(x -> System.out.println("-> " + x));
        // Q2: Print all uppercase names from a list of names.
        namesList.stream().map(String::toUpperCase).forEach(System.out::println);


        // 3. reduce: Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());
        // Q1: Find the sum of all integers in a list using reduce()
        System.out.println("Sum of an A.P. series: " + Stream.iterate(1, x -> x + 2).limit(10).reduce((x, y) -> x + y).get());
        // Q2: Concatenate all strings in a list into a single string using reduce().
        System.out.println(namesList.stream().reduce((x, y) -> x + y).get());


        // 4. count
        // Q1: Count how many numbers in a list are greater than 50.
        System.out.println("Numbers greater than 50 are: " + Stream.iterate(30, x -> x + 2).limit(20).filter(x -> x > 50).count() + " in number");
        // Q2: Count how many strings in a list have length greater than 5.
        System.out.println(namesList.stream().filter(x -> x.length() > 5).count());


        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        // anyMatch: Check if any name in the list starts with "A"
        System.out.println(namesList.stream().anyMatch(x -> x.startsWith("A")));

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        // allMatch: Check if all numbers in a list are even.
        System.out.println(integersList.stream().allMatch(x -> x % 2 == 0));

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);
        // noneMatch: Check if none of the names contain a number.
        System.out.println(namesList.stream().noneMatch(x -> x.matches(".*\\d.*")));


        // 6. findFirst, findAny
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any.get());

        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());


        // 7. toArray
        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min/max
        System.out.println("max: " + Stream.of(2, 44, 536).max(Comparator.naturalOrder()).get());
        System.out.println("min: " + Stream.of(2, 44, 536).min(Comparator.naturalOrder()).get());
        // Q1: Find the shortest string (by length) from a list using min().
        System.out.println(namesList.stream().min((x, y) -> x.length() - y.length()).get());
        // Q2: Find the largest number in a list using max().
        System.out.println(integersList.stream().max(Comparator.naturalOrder()));


        // 9. forEachOrdered --> use it in place of forEach while using parallel stream
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Using forEach with parallel stream: ");
        integerList.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with parallel stream: ");
        integerList.parallelStream().forEachOrdered(System.out::println);


        // +---- Examples -----+

        // Example: Filtering and Collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).collect(Collectors.toList()));

        // Example: Squaring and Sorting numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        List<Integer> squaredAnsSortedNumbers = numbers.stream().map(x -> x * x).sorted().toList();
        System.out.println(squaredAnsSortedNumbers);

        // Example: Summing values
        List<Integer> integers = Arrays.asList(4, 5, 63, 433, -23, 44);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        // Example: Counting Occurrences of a character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // Example
        // Stream can not be used after a terminal operation has been used
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        // List<String> list1 = stream.map(String::toLowerCase).toList(); throws exception


        // Stateless (doesn't know about rest of the element when working on one) and stateful (knows)


        // Q: Given a list of names, use Java Streams to filter names starting with "A" (case-insensitive),
        // convert them to uppercase, sort them in reverse alphabetical order, and collect them into a list.
        List<String> stringList = namesList.stream()
                .filter(x -> x.toUpperCase().startsWith("A"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(stringList);


    }
}
