package com.greatlearning.algo.stack.problems;

public class NextGreaterElementAtRight {

    public static void main(String[] args) {
        int[] a = {5, 4, 1, 9, 3};
        int len = a.length;
        findNextGreaterUsingNestedLoop(a, len);
    }

    private static void findNextGreaterUsingNestedLoop(int[] a, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[j] > a[i]) {
                    System.out.println(a[i] + " -> " + a[j]);
                    break;
                } else if (j == len - 1) {
                    System.out.println(a[i] + " -> -1");
                }
            }
        }
    }
}
