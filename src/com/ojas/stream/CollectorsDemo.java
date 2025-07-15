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
        // Q1: Collect all odd numbers from a list into a list.
        List<Integer> integersList = Arrays.asList(1, 23, 345, 543, 34, 2, 80, 24);
        integersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        // Q2: Convert all strings to uppercase and collect into a list.
        List<String> namesList = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Raghuvanshi", "Anamika", "Nisha", "Apeksha", "Tejashwa");
        namesList.stream().map(String::toUpperCase).collect(Collectors.toList());


        // 2. Collecting to a set
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        // Q1: From a list of repeated cities, collect unique city names.
        List<String> cities = Arrays.asList("Allahabad", "Delhi", "Sonipat", "Allahabad", "Lucknow", "Sonipat");
        cities.stream().collect(Collectors.toSet());
        // Q2: Convert strings to lowercase and store only distinct ones.
        cities.stream().map(String::toLowerCase).collect(Collectors.toSet());


        // 3. Collecting to a specified collection
        names.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
        // Q1: Collect even numbers into a TreeSet.
        System.out.println("Distinct Even numbers TreeSet: " + integersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(() -> new TreeSet<>())));
        // Q2: Collect words into a LinkedList maintaining insertion order.
        cities.stream().collect(Collectors.toCollection(LinkedList::new));


        // 4. Joining Strings --> Concatenates all elements into a single string.
        // Concatenates stream elements into a single string
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);
        // Q1: Join all words into a sentence separated by " ".
        String sentenceOfWords = "Hi I am Ojashwa Tripathi and I am learning Streams";
        System.out.println("Joining!: " + Arrays.stream(sentenceOfWords.split(" ")).collect(Collectors.joining()));
        // Q2: You have a list of cities, join them to show a formatted recipe step or comma-separated string.
        cities.stream().collect(Collectors.joining(", "));
        // Q3: Join names with " | " separator and add prefix/suffix: Collectors.joining(" | ", "Names: ", ".")
        System.out.println("Joining Q3: " + namesList.stream().collect(Collectors.joining(" | ", "Name: ", ".")));


        // 5. Summarizing data
        // Generates statistical summary (count, sum, min, average, max)
        List<Integer> numbersList = Arrays.asList(2, 3, 5, 6, 7, 11);
        IntSummaryStatistics stats = numbersList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        LongSummaryStatistics longSummaryStatistics = integersList.stream().collect(Collectors.summarizingLong(x -> x));
        System.out.println("Max: " + longSummaryStatistics.getMax()
                + ", Min: " + longSummaryStatistics.getMin()
                + ", Average: " + longSummaryStatistics.getAverage()
                + ", Sum: " + longSummaryStatistics.getSum()
                + ", Count: " + longSummaryStatistics.getCount());


        // 6. Calculating average
        Double average = numbersList.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);


        // 7. Counting elements --> used often with grouping based logic
        System.out.println(numbersList.stream().collect(Collectors.counting()));

        // 8. Grouping elements
        List<String> words = Arrays.asList("hello", "java", "world", "streams", "collecting");
        System.out.println("Grouping By length: " + words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println();
        TreeMap<Integer, Long> longTreeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(longTreeMap);
        // Q1: Group names by their starting letter.
        System.out.println("Grouping by starting letter: " + namesList.stream().collect(Collectors.groupingBy(x -> x.charAt(0))));
        // Q2: Group numbers by even/odd using x % 2 == 0.
        System.out.println("Numbers grouping: " + integersList.stream().collect(Collectors.groupingBy(x -> x % 2 == 0)));


        /*+---------Questions on groupingBy------------+*/

        // 📌 Q1: Group names by their first letter, and count how many names start with each letter.
        System.out.println("\nQuestion 1: " + namesList.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting())));

        // 📌 Q2: Group strings by length, and collect their uppercase forms into a Set.
        Map<Integer, Set<String>> collect = namesList.stream().collect(Collectors.groupingBy(String::length, Collectors.mapping(x -> x.toUpperCase(), Collectors.toSet())));

        // 📌 Q3: Group numbers by even/odd and sum all the numbers in each group.
        System.out.println("Question 3: " + integersList.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.reducing((x, y) -> x + y))));
        System.out.println("Question 3: " + integersList.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.summingInt(x -> x))));

        // 📌 Q4: Group words by their length and collect them into LinkedLists (using the 3rd overloaded form).
        System.out.println(namesList.stream().collect(Collectors.groupingBy(String::length, Collectors.toCollection(LinkedList::new))));

        // 📌 Q5: Group strings by whether they contain the letter 'a' and collect as lowercase Set.
        System.out.println(namesList.stream().collect(Collectors.groupingBy(x -> x.contains("a"), Collectors.mapping(String::toLowerCase, Collectors.toSet()))));


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
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6:
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));
    }
}