package com.greatlearning.algo.kadane;

import java.util.HashSet;

public class CountOfLongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 8, 10, 3};
        int max = 0;
        max = getMaxCount(arr, max);
        System.out.println("Element count of Longest consecutive sequence is : " + max);
    }

    private static int getMaxCount(int[] arr, int max) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
           hashSet.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(!hashSet.contains(arr[i]-1)){
                int count = 1;
                int element = arr[i];
                while(hashSet.contains(element+1)){
                    count++;
                    element ++;
                }
                if (count > max){
                    max = count;
                    System.out.println("count:" + count);
                }

            }
        }
        return max;
    }
}
