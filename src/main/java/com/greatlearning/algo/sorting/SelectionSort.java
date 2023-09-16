package com.greatlearning.algo.sorting;

/*
we will select the first element and then compare and we will see
if the first element is greater than second element , then swap and so on ..
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 1, 3};
        // 1,5,2,8,3
        // 1,2,5,8,3
        //1,2,3,8,5
        //1,2,3,5,8
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i+1 ; j < len ; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[pos] = temp;

            for (int k = 0; k < len; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }
}
