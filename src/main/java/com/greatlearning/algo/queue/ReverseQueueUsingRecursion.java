package com.greatlearning.algo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

    public static void main(String[] args) {
        implement();
    }

    private static void implement() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Original Queue:" + queue);
        reverse(queue);
        System.out.println();
        System.out.println("Reversed Queue:" + queue);
    }

    static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        //int k = queue.front;
        int k = queue.peek();
        System.out.println("peeked element: " + k);
        int r = queue.remove();
        System.out.println("removed element: " + r);
        reverse(queue);
        queue.add(k);
    }
}
