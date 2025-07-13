package com.ojas.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        Stream<Integer> boxed = stream.boxed();

        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

        IntStream.of(1, 2, 3, 4);

        DoubleStream doubles = new Random().doubles(5);
        IntStream ints = new Random().ints(5);
        System.out.println(doubles.boxed().toList());
        System.out.println(ints.boxed().toList());


    }
}
