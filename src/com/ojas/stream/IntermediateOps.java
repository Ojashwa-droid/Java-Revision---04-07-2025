package com.ojas.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate Operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Raghuvanshi", "Anamika", "Nisha", "Apeksha");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("R"));
        // no filtering at this point of time
        long count = filteredStream.count();
        System.out.println(count);
        // ✅ Q1: Filter out only even numbers from a list.
        List<Integer> integerList = Arrays.asList(1, 23, 345, 543, 34, 2, 80);
        integerList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        // ✅ Q2: From a list of strings, keep only those starting with "A" or ending with "a".
        System.out.println(list.stream().filter(x -> x.startsWith("A") || x.endsWith("a")).toList());
        // Another way of doing the same
        Predicate<String> nameStartsWithA = x -> x.startsWith("A");
        Predicate<String> nameEnsWitha = x -> x.endsWith("A");
        System.out.println(list.stream().filter(nameStartsWithA.or(nameEnsWitha)));


        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        //✅ Q1: Convert a list of strings to their lengths.
        System.out.println(list.stream().map(x -> x.length()).collect(Collectors.toList()));
        //✅ Q2: Convert a list of prices in dollars to rupees (multiply by 83).
        System.out.println(integerList.stream().map(x -> x * 83).toList());


        // 3. sorted --> sorted in natural ordering or with custom comparator (passed as a lambda expression)
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingCustomComparator = list.stream().sorted((a, b) -> a.length() - b.length());
        //✅ Q1: Sort a list of integers in ascending order.
        System.out.println("Integer List sorted in ascending order:  " + integerList.stream().sorted().toList());
        //✅ Q2: Sort a list of strings in descending order of their length.
        System.out.println("List of names sorted in descending order of their length: "
                + list.stream()
                .sorted((x, y) -> y.length() - x.length())
                .toList());


        // 4. distinct --> in terms of uniqueness
        System.out.println(list.stream().filter(x -> x.startsWith("R")).distinct().count());
        //✅ Q1: From a list with repeated integers, get only unique values.
        List<Integer> integerList1 = Arrays.asList(1, 1, 6, 7, 8, 7, 8, 76, 4, 5, 5, 6, 3, 3, 2, 3, 78, 87, 89, 7665);
        System.out.println("List of integers without duplicates and sorted: " + integerList1.stream().distinct().sorted().toList());
        //✅ Q2: From a list of strings like ["dog", "cat", "dog", "cat", "bird"], remove duplicates.
        Stream<String> animals = Stream.of("dog", "cat", "dog", "cat", "bird");
        System.out.println("List of animals with distinct members: " + animals.distinct().collect(Collectors.toList()));


        // 5. limit --> Limits the stream to the first n elements.
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100));
        //✅ Q1: Take the first 3 numbers from a list.
        System.out.println("First three integers from a distinct list: " + integerList1.stream().distinct().limit(3).toList());
        //✅ Q2: After sorting names, limit to top 2 alphabetically.
        System.out.println("Top two names from list of names after sorting: "
                + list.stream()
                .sorted((x, y) -> x.length() - y.length())
                .limit(2)
                .toList());


        // 6. skip --> Skips the first n elements.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).count();
        //✅ Q1: From a list of numbers 1–10, skip the first 5.
        System.out.println("First 5 skip from list of natural number of size 10: "
                + Stream.iterate(1, x -> x + 1)
                .limit(10)
                .skip(5)
                .toList());
        //✅ Q2: Skip first 2 strings from a list and collect the rest.
        System.out.println(list.stream().skip(2).collect(Collectors.toList()));


        // 7. peek --> uses consumer to perform an action on each element like forEach but is an intermediate operator
        Optional<Integer> collect = Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(100)
                .peek(System.out::println)
                .reduce((x, y) -> (x + y));
        System.out.println(collect.get());
        //✅ Q1: Print each element before doubling it with map().
        System.out.println("Peek1!: " + integerList.stream().peek(System.out::println).map(x -> x * 2).collect(Collectors.toList()));
        //✅ Q2: Use peek() to log each string before filtering out short strings (length < 4).
        System.out.println(list.stream().peek(System.out::println).filter(x -> x.length() > 4).toList());


        // 8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g. lists within lists) so they can be processed
        // Transforms and flatten elements at the same time
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        List<String> fruits = listOfLists
                .stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .toList();
        System.out.println(fruits);

        List<String> stringList = Arrays.asList(
                "Hello world",
                "This is Ojashwa Tripathi",
                "I love java"
        );

        List<String> list1 = stringList.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String::toLowerCase).toList();
        System.out.println(list1);


        System.out.println(stringList
                .stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(String::toUpperCase)
                .toList());
    }
}
