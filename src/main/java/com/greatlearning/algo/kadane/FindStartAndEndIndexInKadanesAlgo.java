package com.greatlearning.algo.kadane;

public class FindStartAndEndIndexInKadanesAlgo {
    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

    private void findIndexesInArray(){
        int max = -9999;
        int maxEndingHere = 0;
        int startIndex=0;
        int endIndex=0;
        for (int i = 0; i < arr.length ; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if(max < maxEndingHere){
                max = maxEndingHere;
                endIndex = i;
            }
            if(maxEndingHere < 0){
                maxEndingHere = 0;
                startIndex = i+1;
            }

        }

        System.out.println("Start Index:" + startIndex + "End Index:" + endIndex);
        System.out.println("max:" + max);
    }
    public static void main(String[] args) {
        (new FindStartAndEndIndexInKadanesAlgo()).findIndexesInArray();
    }
}
