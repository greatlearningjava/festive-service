package com.greatlearning.algo.graph;

public class PrismsAlgorithm {

    public static void main(String[] args) {

        // Minimum spanning tree with n nodes will have n-1 edges

        int[][] m = new int[5][5];

        int row = m.length;
        int col = m[0].length;

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

        int[] visited = new int[row];

       prismAlgo(m,0,visited, row, col);


    } // main method ends

    private static void prismAlgo(int[][] m, int srcVertex, int[] visited, int row, int col) {
        visited[srcVertex] = 1;
        int u = 0;
        int v = 0;
        int total = 0;
        for (int count = 0; count < 4; count++) {
            System.out.println("count: " + count);
            int min = 999;
            for (int i = 0; i < row; i++) {
                if(visited[i] == 1){
                    for (int j = 0; j < col; j++) {
                        if(visited[j] != 1){
                            if(m[i][j] < min){
                                min = m[i][j];
                                u = i;
                                v = j;
                                System.out.println("min: " + min + ", u: " + u + ", v: " + v);
                            }
                        }
                    } // column for loop closed
                } // visited if closed
            } // row loop ends
            visited[v] = 1;
            total = total + min;
            m[u][v] = 999;
            System.out.println("(u,v):"+ "(" + u + "," + v + ")");

        } // edge for loop closed

        System.out.println("Cost of minimum spanning tree is : " + total);
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

