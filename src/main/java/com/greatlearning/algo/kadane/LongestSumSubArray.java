package com.greatlearning.algo.kadane;

public class LongestSumSubArray {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = -9999;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println("Sum of first sub array:" + max + ", current sum:" + sum);
        }
        System.out.println("Sum of Longest Sum Sub Array:" + max);
    }
}
