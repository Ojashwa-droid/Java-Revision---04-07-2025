package com.ojas.java8.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = getName(1);
//        if (name.isPresent()){
//            System.out.println(name.get());
//        }
//
//        name.ifPresent(System.out::println);

        name.orElse("NA");
        name.orElseGet(() -> new String("NA"));
        String nameToBeUsed = name.orElseThrow(NoSuchElementException::new);
        System.out.println(nameToBeUsed);

        Optional<String> string = name.map(String::toUpperCase);


    }

    private static Optional<String> getName(int id) {
        String name = "Ojashwa";
//        return Optional.of(name); throws exception in case the value is null
//        return Optional.ofNullable(name); // doesn't raise exception
        return Optional.empty();
    }
}
