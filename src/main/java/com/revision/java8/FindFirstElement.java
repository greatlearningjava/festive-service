package com.revision.java8;

import java.util.Arrays;
import java.util.List;

//Given the list of integers, find the first element of the list using Stream functions?
public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);
        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println(myList.stream().count());
        //find the maximum value in list
        myList.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);
        System.out.println("max:" +  myList.stream().max(Integer::compare).get());

        System.out.println(myList.stream().mapToInt(Integer::intValue).sum());

    }
}
