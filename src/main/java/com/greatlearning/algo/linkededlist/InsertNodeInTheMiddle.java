package com.greatlearning.algo.linkededlist;

import java.util.Scanner;

public class InsertNodeInTheMiddle {
    public static void main(String[] args) {
        //Insert the element in the midddle.
        Node first = LinkedListMain.createLinkedListSelf();
        LinkedListMain.printLinkedList(first);
        System.out.println("Enter the number that need to be inserted in the middle");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Node temp = first;
        Node previous = first;
        while(temp != null){
            if(temp.num < k){
                previous = temp;
                temp = temp.ptr;
            }else{
                Node newNode = new Node(k);
                previous.ptr = newNode;
                newNode.ptr = temp;
                break;
            }
        }

        LinkedListMain.printLinkedList(first);

    }
}
