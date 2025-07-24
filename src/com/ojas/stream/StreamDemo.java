package com.ojas.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // feature introduced in java 8
        // process collection of data in functional and declarative manner (lambda expressions)
        // Simplify data processing
        // Embrace functional programming
        // Enable easy parallelism`

        //// How to use Streams ?
        // Source, intermediate operations & terminal operation
        // Stream: basically a pipeline through which collection of data is processed and obtained at as result at the end
        // --> in short stream is a sequence of elements supporting functional and declarative programming (tell what to do and not how to do)

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
/*
        +---Traditional way---+
        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
*/
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());


        // Creating Streams
        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();

        // 2. From Arrays
        String[] names = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(names);


        int[] integerArray = {1, 2, 3, 4, 5, 6};
        IntStream stream3 = Arrays.stream(integerArray);

        String naam = "Ojashwa";
        Stream<String> stream4 = Arrays.stream(naam.split(""));


        // 3. Using Stream.of
        Stream<String> stream2 = Stream.of("a", "b", "c", "d");


        // 4. Infinite Stream
        Stream.generate(() -> 1).limit(100);
        Stream.iterate(1, x -> x + 1).limit(100);


    }
}
