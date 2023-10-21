package com.greatlearning.algo.stack.problems;

import java.util.Stack;

public class FindPreviousGreaterElement {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        System.out.println("input stack" + stack);

       // System.out.println(reverseStack(stack));

    }

    private static Stack<Integer> reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }
        int top = stack.peek();
        stack.pop();
        reverseStack(stack);
        stack.push(top);
        return stack;
    }


}
