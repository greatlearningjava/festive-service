package com.greatlearning.algo.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Find Non-repeating element in Array
 */
public class NonRepeatingElementInArray {

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6,4,6,1,10};
        usingHashMap(arr);
        usingHashSet(arr);
    }

    private static void usingHashSet(int[] arr) {
        int first = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if (set.contains(arr[i])) {
                first = arr[i];
                System.out.println("first:" + first);
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println("The first Non repeating Number is : " + first);
    }

    private static void usingHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.getOrDefault(arr[i], -1) == -1){
                map.put(arr[i], i);
            }else{
                map.put(arr[i], -99);
            }

        }
        System.out.println(map);
        int num = -1;
        int index = -1;
        Set<Map.Entry<Integer, Integer>> entrySet =  map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet ) {
            if(entry.getValue() >= 0) {
                if (index == -1 || index > entry.getValue()) {
                    num = entry.getKey();
                    index = entry.getValue();
                }
            }
        }
        if(num != -1) {
            System.out.println("Number is : " + num);
        }else {
            System.out.println("There is no non-repeating element");
        }

    }
}

