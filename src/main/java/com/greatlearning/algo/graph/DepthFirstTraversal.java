package com.greatlearning.algo.graph;

import java.util.*;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1,4));
        graph.put(1, Arrays.asList(0,2,4));
        graph.put(2, Arrays.asList(1,3,5,6));
        graph.put(3, Arrays.asList(2,6));
        graph.put(4, Arrays.asList(0,1,5));
        graph.put(5, Arrays.asList(2,4,6));
        graph.put(6, Arrays.asList(2,3,5));


        depthFirstTraversal(graph,0,7);

    }
    public static void depthFirstTraversal(HashMap<Integer, List<Integer>> graph, int src, int n ){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        stack.push(src);
        System.out.println("Printing the depth First Traversal");
        while (!stack.isEmpty()){
            int current = stack.pop();
            System.out.print(current + " ") ;
            visited[src] = true;
            List<Integer> neighbors = graph.get(current);
            for (Integer element : neighbors ) {
                if(visited[element] == false){
                    stack.push(element);
                    visited[element] = true;
                }
            }

        }
    }
}
