package com.greatlearning.algo.sorting;

/*
we will select the first element and then compare with adjacent element and we will see
if the first element is greater than next element , then swap and so on ..
--> once the first iteration will complete will get the highest element at the end.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 1, 3};
        // 5,8,2,1,3
        // 5,2,8,1,3
        //5,2,1,8,3
        //5,2,1,3,8
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            for (int k = 0; k < len; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }
}
