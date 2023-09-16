package com.greatlearning.algo.sorting;

public class InsertionSort {

    int arr[] = {8,5,2,1,3};

    public static void main(String[] args) {
        (new InsertionSort()).sort();
    }

    private void sort() {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            j = i-1;
            while(j >=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
