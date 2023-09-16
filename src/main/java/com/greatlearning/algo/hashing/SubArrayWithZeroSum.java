package com.greatlearning.algo.hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    //int arr[] = {4, 2, -3, 1, 6};
    int arr[] = {5, 3, -4, 4, 7};

    public static void main(String[] args) {
        SubArrayWithZeroSum subArrayWithZeroSum = new SubArrayWithZeroSum();
        System.out.println("withHelpOfNestedForLoop: " + subArrayWithZeroSum.withHelpOfNestedForLoop());
        System.out.println("useHashing: " + subArrayWithZeroSum.useHashing());
    }

    private boolean useHashing() {
        int sum = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
            if(hashSet.contains(sum) || sum == 0){
                return true;
            }else{
                hashSet.add(sum);
            }
        }
        System.out.println(hashSet);
        return false;
    }

    private boolean withHelpOfNestedForLoop() {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){
                sum = sum + arr[j];
                if(sum == 0){
                    flag = true;
                    System.out.println("Start index:" + i + ", end index: " + j);
                    break;
                }
            }

        }
      return flag;
    }
}
