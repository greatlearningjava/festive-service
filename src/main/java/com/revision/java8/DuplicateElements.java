package com.revision.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet set = new HashSet();
        myList.stream().filter(element -> !set.add(element)).forEach(System.out::println);
    }
}
