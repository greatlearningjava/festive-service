package com.greatlearning.algo.linkededlist;

import java.util.Scanner;

public class MyLinkedList {

    int num;
    MyLinkedList ptr;


    public static void main(String[] args) {
        MyLinkedList first = null;
        MyLinkedList head = null;
        MyLinkedList temp = null;
        char ch = 'Y';

        do{
            head = new MyLinkedList();
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            head.num = num;
            head.ptr = null;
            if (first ==null){
                first = temp = head;
            }

        }while (ch == 'Y');
    }

}
