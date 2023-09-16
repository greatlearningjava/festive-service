package com.greatlearning.algo.linkededlist;

import java.util.Scanner;

public class LinkedListMain {

    public static final char YES = 'y';

    public static void main(String[] args) {
        //Node first = createLinkedListUsingUserInput();
        Node first = createLinkedListSelf();
        printLinkedList(first);
    }

    public static Node createLinkedListSelf() {
        Node first = null;
        Node temp = null;
        Node head = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of linkedList: ");
        int size = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < size; i++) {
            num = num + 5;
            head = new Node(num);
            if(first==null){
                first = temp = head;
            }else{
                temp.ptr = head;
                temp = head;
            }

        }
        return first;
    }

    public static Node createLinkedListUsingUserInput() {
        Node first = null;
        Node temp = null;
        Node head = null;
        char choice = YES;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number for linked list: ");
            int num = scanner.nextInt();
            head = new Node(num);
            if(first == null){
                first = temp = head;
            }else{
                temp.ptr = head;
                temp = head;
            }
            System.out.print("Do you enter next element in linked list: ");
            choice = scanner.next().charAt(0);
        } while (YES == choice);
        return first;
    }

    public static void printLinkedList(Node node) {
        Node temp = node;
        int count = 0;
        while(temp != null){
            System.out.print(temp.num + "   ");
            temp = temp.ptr;
            count ++;
        }
        System.out.println("\nTotal nodes in the list are: " + count);
    }
}
