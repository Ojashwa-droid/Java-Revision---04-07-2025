package com.ojas.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        // Java 8 --> minimal code and functional programming
        // --> lambda expression, Streams, Date & Time API

        // Lambda expression --> anonymous functions with no name, no return type and no access modifier
        // are generally used in to define methods of a functional interface (an interface with one abstract method)
//        Thread t1 = new Thread(() -> {
//            System.out.println("Hello i am running!");
//        });

        MathOperation sumOperation = (a, b) -> a + b;
        int operation = sumOperation.operation(1, 2);
        System.out.println(operation);


        // Predicate --> functional interface (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithA = x -> x.toLowerCase().endsWith("a");
        System.out.println(isWordStartingWithA.test("America"));
        System.out.println(isWordStartingWithA.and(isWordEndingWithA).test("America"));


        // Function (functional interface) --> works for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));

        Function<Integer, Integer> identity = Function.identity();
        Integer result = identity.apply(12);
        System.out.println(result);

        // Consumer --> consumes sth
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier --> gives sth without taking anything
        Supplier<String> giveHelloWorld = () -> "Hello world";
        System.out.println(giveHelloWorld.get());




        /* +--------Combined Example-----+ */

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }


        // BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
        System.out.println(isSumEven.test(2, 4));

        BiConsumer<Integer, String> biConsumer = (x, y) -> System.out.println(x + " is " + y);
        biConsumer.accept(2, "Two");

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bcd"));


        // UnaryOperator, BinaryOperator
        UnaryOperator<String> doubleString = x -> x + x;
        BinaryOperator<Integer> sumOfTwoNum = (x, y) -> x + y;
        System.out.println(doubleString.apply("Hi"));
        System.out.println(sumOfTwoNum.apply(2, 3));


        // Method Reference --> use the method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        // Constructor Reference
        List<String> phones = Arrays.asList("A", "B", "C");
        Set<MobilePhone> collect = phones.stream().map(MobilePhone::new).collect(Collectors.toSet());


    }
}

class MobilePhone{
    private String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

class SumOperation implements MathOperation {

    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello i am running!");
    }
}