package com.revision.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeJava8Main {
    public static void main(String[] args) {
        findEven();

    }

    private static void findEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = numbers.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
        even.forEach(System.out::print);

        even = numbers.stream().map(e-> e+10).collect(Collectors.toList());
        //even.forEach(System.out::println);

        //
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum="+sum);

    }
}
