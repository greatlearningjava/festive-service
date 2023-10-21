package com.greatlearning.algo.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GivenAQueueReverseFirstKElement {

    public static void main(String[] args) {
        implement();
    }

    private static void implement() {
        Queue<Integer> queue  = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k = 3;

        reverseFirstK(queue, k);

    }

    private static void reverseFirstK(Queue<Integer> queue, int k) {
        if(queue.isEmpty()){
            return;
        }
        if(queue.size() < k){
            return;
        }
    }
}
