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

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce: Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

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
//       List<String> list1 = stream.map(String::toLowerCase).toList(); throws exception


        // Stateless (doesn't know about rest of the element when working on one) and stateful (knows)
    }
}
