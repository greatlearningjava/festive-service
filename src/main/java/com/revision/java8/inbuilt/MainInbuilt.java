package com.revision.java8.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainInbuilt {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.print("filter and predicate : ");
        names.stream().filter((name) -> name.startsWith("A")).forEach(System.out::println);

        List<Integer> length = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println("con");
        length.stream().forEach( System.out::println);
        Consumer<String> consumer = name -> System.out.println(name);
        //Consumer<String> consumer = System.out::println;

        //names.stream().forEach(System.out::println);
        Function<String, Integer> function = (word) -> word.length();
        System.out.println(function.apply("manoj"));



    }
}
