package com.ojas.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1 Collecting to a list
        List<String> names = Arrays.asList("Ram", "Shyam", " Ghanshyam", "Ramesh");
        List<String> res = names.stream()
                .filter(x -> x.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a set
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());

        // 3. Collecting to a specified collection
        names.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));

        // 4. Joining Strings
        // Concatenates stream elements into a single string
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5. Summarizing data
        // Generates statistical summary (count, sum, min, average, max)
        List<Integer> numbersList = Arrays.asList(2, 3, 5, 6, 7, 11);
        IntSummaryStatistics stats = numbersList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());

        // 6. Calculating average
        Double average = numbersList.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);

        // 7. Counting elements
        System.out.println(numbersList.stream().collect(Collectors.counting()));

        // 8. Grouping elements
        List<String> words = Arrays.asList("hello", "java", "world", "streams", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println();
        TreeMap<Integer, Long> longTreeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(longTreeMap);

        // 9. Partitioning elements
        // Partitioning elements into groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 10. Mapping and Collecting
        // Applies mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));



        /* +----------Examples--------+ */

        // Example 1: Collecting names by length
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(x -> x.length())));

        // Example 2: Counting word occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3: Partitioning Even and Odd numbers
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        // Example 4: Summing values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));

        // Example 5: Creating a Map from Stream elements
        List<String> fruits = Arrays.asList("Appla", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x-> x.toUpperCase(), x -> x.length())));

        // Example 6:
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));
    }
}