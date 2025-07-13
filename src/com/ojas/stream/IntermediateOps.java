package com.ojas.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate Operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Raghuvanshi");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("R"));
        // no filtering at this point of time
        long count = filteredStream.count();
        System.out.println(count);

        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted --> sorted in natural ordering
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingCustomComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. distinct --> in terms of uniqueness
        System.out.println(list.stream().filter(x -> x.startsWith("R")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100));

        // 6. skip
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).count();

        // 7. peek --> uses consumer to perform an action on each element like forEach but is an intermediate operator
        Optional<Integer> collect = Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).reduce((x, y) -> (x+y));
        System.out.println(collect.get());

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
        System.out.println(stringList
                .stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(String::toUpperCase)
                .toList());
    }
}
