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

        MathOperation mathOperation = returnLambdaAsReturnValue();
        System.out.println(mathOperation.operation(2, 3));


        // Predicate --> functional interface (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithA = x -> x.toLowerCase().endsWith("a");
        System.out.println(isWordStartingWithA.test("America"));
        System.out.println(isWordStartingWithA.and(isWordEndingWithA).test("America"));

//      Example:  Write a Predicate<Integer> that checks if a person is eligible to vote (age ≥ 18).
        Predicate<Integer> isEligible = x -> x >= 18;
        System.out.println(isEligible.test(12));
        System.out.println(isEligible.test(17));
        System.out.println(isEligible.test(19));

//      Example:  Write a Predicate<String> that returns true if a string contains "@gmail.com".
        Predicate<String> validEmail = x -> x.endsWith("@gmail.com");
        System.out.println("Is the email valid? " + validEmail.test("ojashwatiwai@gmail.com"));


        // Function (functional interface) --> works for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));

        Function<String, Integer> stringLength = x -> x.length();
        System.out.println("Ojashwa string length is: " + stringLength.apply("Ojashwa"));

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
        Consumer<String> toUpperCaseString = x -> System.out.println(x.toUpperCase());

        // Supplier --> gives sth without taking anything
        Supplier<String> giveHelloWorld = () -> "Hello world";
        System.out.println(giveHelloWorld.get());

        Supplier<Double> giveRandomNumber = () -> Math.random();
        System.out.println(giveRandomNumber.get());




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
        BiConsumer<String, Integer> multiPleTimesString = (x, y) -> System.out.println(x + " is repeated " + y + " times:" + x.repeat(y));
        multiPleTimesString.accept("Ojashwa", 3);


        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bcd"));
        BiFunction<Integer, Integer, Integer> productOfTwoNumbers = (x, y) -> x * y;
        System.out.println(productOfTwoNumbers.apply(2, 3));


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
    public static MathOperation returnLambdaAsReturnValue(){ // returning the lambda expression as a return value --> using functional programming properties
        return (a, b) -> a + b;
    }
}



class MobilePhone {
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