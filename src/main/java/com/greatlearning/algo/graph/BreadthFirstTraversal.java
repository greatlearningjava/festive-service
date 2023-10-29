package com.greatlearning.algo.graph;

import java.util.*;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1,4));
        graph.put(1, Arrays.asList(0,2,4));
        graph.put(2, Arrays.asList(1,3,5,6));
        graph.put(3, Arrays.asList(2,6));
        graph.put(4, Arrays.asList(0,1,5));
        graph.put(5, Arrays.asList(2,4,6));
        graph.put(6, Arrays.asList(2,3,5));

        breadthFirstTraversal(graph,0,7);

    }

    public static void breadthFirstTraversal(HashMap<Integer, List<Integer>> graph, int src, int n ){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(src);
        visited[src] = true;
        System.out.println("breadthFirstTraversal :");
        while (!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");
            List<Integer> neighbors = graph.get(current);
            for(int k: neighbors){
                if(visited[k] == false){
                    queue.add(k);
                    visited[k] = true;
                }
            }
        }

    }


}
