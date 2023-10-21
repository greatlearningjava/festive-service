package com.greatlearning.algo.queue.floodfill;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public static void main(String[] args) {
        int a[][] = {{2,1,1,2}, {2,2,1,1}, {2, 3, 3, 1}, {2,2,3,3}};
        int nc = 5; // new color code
        int row = 1;
        int col = 2;
        int oc = a[row][col];
        printArray(a);
        Queue<Point> queue = new LinkedList<>();
        Point temp = new Point(1,2);
        queue.add(temp);
        while(!queue.isEmpty()){
            Point p = queue.remove();
            a[row][col] = nc;

            Point up = new Point(p.x-1,p.y);
            if(isValid(up, oc, a)){
                queue.add(up);
            }
            Point down = new Point(p.x+1,p.y);
            if(isValid(down, oc, a)){
                queue.add(up);
            }
            Point left = new Point(p.x,p.y-1);
            if(isValid(left, oc, a)){
                queue.add(up);
            }

            Point right = new Point(p.x,p.y+1);
            if(isValid(right, oc, a)){
                queue.add(up);
            }
        }
        System.out.println("after update");
        printArray(a);

    }

    private static boolean isValid(Point k, int oc, int a[][]) {
        int row = a.length;
        int col = a[0].length;

        if(k.x >= 0 && k.x < row && k.y >=0 && k.y < col){
            if(a[k.x][k.y] == oc){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    private static void  printArray(int a[][]){

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print( a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
