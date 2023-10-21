package com.greatlearning.algo.stack;

import java.util.Stack;

public class StackBuilder {

    private static Stack<Integer> stack = null;

    private StackBuilder() {

    }

    public static Stack build(int... elements) {
        stack = new Stack<>();
        for (int element : elements) {
            stack.push(element);
        }
        return stack;
    }
}
