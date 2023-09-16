package com.greatlearning.algo.hashing;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "AAA";
        String str2 = "AAB";
        int arr[] = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int num = ch;
            //System.out.println(num);
            arr[num]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            int num = ch;
            //System.out.println(num);
            arr[num]--;
        }
        boolean anagram = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                anagram = false;
                break;
            }
        }
        System.out.println("Is string Anagram:" + anagram);
    }
}
