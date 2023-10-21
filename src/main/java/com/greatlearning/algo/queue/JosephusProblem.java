package com.greatlearning.algo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {


    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        Queue<Integer> queue = makeQueue(5);
        System.out.println(queue);

        while(queue.size()!=1){
            int j = 1;
            while (j < k){
                int temp  = queue.peek();
                queue.add(temp);
                System.out.println(queue);
                queue.remove();
                System.out.println(queue);
                j++;
            }
            queue.remove();
            System.out.println(queue);
        }
        System.out.println(queue.peek());
    }

    private static Queue<Integer> makeQueue(int n){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            queue.add(i);
        }
        return queue;

    }
}
