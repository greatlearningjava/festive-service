package com.greatlearning.algo.stack;

import java.util.Stack;

public class InsertNumberAtBottomOfStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.push(3);

        System.out.println("input stack" + stack);

        System.out.println(insertAtLast(stack, 7));
        System.out.println(insertAtLast(stack, 99));

    }

    private static void insertAtBottom(Stack<Integer> stack, int k){
        if(stack.isEmpty()){
            stack.push(k);
            return;
        }
        int top = stack.peek();
        stack.pop();
        insertAtBottom(stack,k);
        stack.push(top);
    }

    private static Stack<Integer> insertAtLast(Stack<Integer> stack, int k){
        insertAtBottom(stack, k);
        return stack;
    }

    private static Stack<Integer> insertAtBottom2(Stack<Integer> stack, int k){
        if(stack.isEmpty()){
            stack.push(k);
            return stack;
        }
        int top = stack.peek();
        stack.pop();
        insertAtBottom2(stack,k);
        stack.push(top);
        return stack;
    }


}
