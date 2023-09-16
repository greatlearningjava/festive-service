package com.greatlearning.algo.hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 4. Check if a subarray with given sum exists
 */
public class CheckIfThereIsSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {15, 5, 2, 7, 1, 9};
        int sum = 30;
        // sub array would be 5,2,7,1
        System.out.println("Enter sum of sub Array:");
        Scanner scanner = new Scanner(System.in);
        //sum = scanner.nextInt();
        boolean isExist = findSubArrayWithGivenSum(arr, sum);
        System.out.println(isExist);
    }

    private static boolean findSubArrayWithGivenSum(int[] arr, int sum) {
        HashSet<Integer> hashSet = sumOfArrayElement(arr);
        System.out.println(hashSet);
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(sum + arr[i])){
                return true;
            }
        }
        return false;
    }

    private static HashSet<Integer> sumOfArrayElement(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum = tempSum + arr[i];
            hashSet.add(tempSum);

        }
        return hashSet;
    }

}
