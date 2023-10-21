package com.greatlearning.algo.stack.problems;

import com.greatlearning.algo.stack.StackBuilder;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Stack<Integer> stack = StackBuilder.build(10, 10, 5, 15, 20, 22);
        System.out.println(stack);
        int p[] = {20,10,5,15,30,22};
        int ans[] = new int[p.length];

        Stack<Integer> st = new Stack<>();
    }
}
