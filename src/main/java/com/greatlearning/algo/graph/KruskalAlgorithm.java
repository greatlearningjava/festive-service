package com.greatlearning.algo.graph;

public class KruskalAlgorithm {

    public static void main(String[] args) {

        // Minimum spanning tree with n nodes will have n-1 edges
        /*
        1) sort all the edges in ascending order
        2) one by one keep adding the edges to MST such that it does not form a cycle.
        3) mst will have n-1 edges
         */

        int[][] m = new int[5][5];

        int row = m.length;
        int col = m[0].length;

        // set the value of edges in adjacency matrix
//        m[0][1] = 5;
//        m[0][3] = 7;
//        //m[0][3] = 1;
//        m[1][3] = 1;
//        m[2][1] = 1;
//        m[2][4] = 2;
//        m[3][2] = 4;
//        m[4][1] = 1;

        // set the value of edges in adjacency matrix
        m[0][1] = 2;
        m[0][3] = 3;
        m[1][3] = 1;
        m[2][1] = 3;
        m[2][4] = 2;
        m[3][2] = 4;
        m[4][1] = 5;


        //print matrix element
        System.out.println("print matrix element");
        printMatrix(m, row, col);

        replaceZeroWithMaxValue(m, row, col);

        //print matrix element
        System.out.println("print matrix element");
        printMatrix(m, row, col);
        int[] parent = new int[row];
        for (int i = 0; i < row; i++) {
            parent[i] = -1;
        }
       kruskalAlgo(m,0, parent, row, col);

        printMatrix(m, row, col);


    } // main method ends

    private static void kruskalAlgo(int[][] m, int srcVertex, int[] parent, int row, int col) {

       // visited[srcVertex] = 1;
        int u = 0;
        int v = 0;
        int total = 0;
        int noOfEdges = 1;
        while(noOfEdges < 5){
            System.out.println("noOfEdges: " + noOfEdges);
            int min = 999;
            for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                            if(m[i][j] < min){
                                min = m[i][j];
                                u = i;
                                v = j;
                                System.out.println("    min: " + min + ", u: " + u + ", v: " + v);
                            }

                    } // column for loop closed

            } // row loop ends , after this loop we will have the minimum edge in the graph
           // visited[v] = 1;
            int x = u;
            int y = v;
            while(parent[x] != -1){
                x = parent[x];
            }
            while(parent[y] != -1){
                y = parent[y];
            }
            if( x != y){
                total = total + min;
                noOfEdges++;
                System.out.println("(u,v):"+ "(" + u + "," + v + ")" + ", min:" + min);
                parent[v] = u;
            }

            m[u][v] = 999;

            printArray(parent);

        } // edge while loop closed

        System.out.println("Cost of minimum spanning tree is : " + total);

    }

    private static void printArray(int[] parent) {
        System.out.println("Parent Array");
        for (int i = 0; i < parent.length; i++) {
            System.out.print("      " +parent[i] + "  ");
        }
        System.out.println();
    }

    private static void replaceZeroWithMaxValue(int[][] m, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (m[i][j] == 0) {
                    // m[i][j] = Integer.MAX_VALUE;
                    m[i][j] = 999;
                }
            }
        }
    }

    private static void printMatrix(int[][] m, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(m[i][j] + "        ");
            }
            System.out.println();
        }
    }

}

