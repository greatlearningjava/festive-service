package com.greatlearning.algo.hashing;

import java.util.HashMap;

public class MostFrequentElementInArray {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,7,7,7,7,7,7,7,7,5,4,2,3,3,3,6,7,7,7,1,1,5,6,7,4,3,2,1,1,1,6,7,9};
        HashMap<Integer, Integer> map = new HashMap<>();
        int element = -1;
        int maxFrequency = -1;
        for (int i = 0; i < arr.length; i++) {
                int val =  map.getOrDefault(arr[i],0);
                int frequency = val+1;
                map.put(arr[i],frequency);
            if(frequency > maxFrequency) {
                element = arr[i];
                maxFrequency = frequency;
            }
        }
        System.out.println(map);
        System.out.println("element:" + element);
        System.out.println("maxFrequency:" + maxFrequency);

    }
}
