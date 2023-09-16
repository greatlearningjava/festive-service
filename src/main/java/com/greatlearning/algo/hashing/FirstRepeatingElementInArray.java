package com.greatlearning.algo.hashing;

import java.util.HashSet;

public class FirstRepeatingElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                min = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println("First repeating element in Array:" + min);
    }
}
