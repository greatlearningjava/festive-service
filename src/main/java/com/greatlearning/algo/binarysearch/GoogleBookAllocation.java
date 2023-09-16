package com.greatlearning.algo.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class GoogleBookAllocation {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40}; // given the pages in books
        //find the maximum number of pages allocated to a student is minimum
        // allocation must be contiguous
        int num = noOfStudents();
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum:" + sum);
        int first = 0;
        int last = sum;
        int ans = -1;
        while (first <= last) {
            int mid = (first + last) / 2;
            boolean isPossible = isPossible(arr, mid, num);
            if (isPossible) {
                ans = mid;
                System.out.println("possible ans: " + ans);
                last = mid;

            }else{
                first = mid + 1;
            }
        }

        System.out.println("final ans: " + ans);

    }

    private static boolean isPossible(int[] arr, int mid, int num) {
        int count  = 1;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]+sum <= mid){
                sum = arr[i]+sum;
            } else{
                count ++;
                if(count > num){
                    return false;
                }else{
                    sum=arr[i];
                }
            }
        }

        return true;
    }

    private static int noOfStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of students for the allocation of pages: ");
        int noOfStudents = scanner.nextInt();
        System.out.println("Entered no of students: " + noOfStudents);
        scanner.close();
        return noOfStudents;
    }
}
