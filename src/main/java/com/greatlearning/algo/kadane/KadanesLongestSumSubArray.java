package com.greatlearning.algo.kadane;

public class KadanesLongestSumSubArray {
    /*
    At least one positive number is number
     */
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = -9999;
        int maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if(max < maxEndingHere) {
                max = maxEndingHere;
            }
            System.out.println("Sum of first sub array:" + max + ", current maxEndingHere:" + maxEndingHere);
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }

        }
        System.out.println("Sum of Longest Sum Sub Array:" + max);
    }
}
