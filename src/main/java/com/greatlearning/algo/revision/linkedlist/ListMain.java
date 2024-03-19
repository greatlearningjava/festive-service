package com.greatlearning.algo.revision.linkedlist;

import com.greatlearning.algo.linkededlist.Node;

import java.util.Scanner;

public class ListMain {

    public static Node createLinkedListUsingUserInput() {
        Node first = null;
        Node temp = null;
        Node head = null;

        char ch = 'y';
        System.out.println("Do you want to create list (y/n)");
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.next();
        ch = input.charAt(0);

        while (ch == 'y'){
            Scanner valScanner = new Scanner(System.in);
            int val = valScanner.nextInt();
            head = new Node(val);
            if(first == null){
                first = head;
                temp = head;
            }else{
                temp.ptr = head;
                temp = head;
            }
        }

        System.out.println("Do you want to continue (y/n)");


        return first;
    }

    public static void main(String[] args) {

        createLinkedListUsingUserInput();
//        MyNode linkedList = null;
//        CreateLinkedList list = new CreateLinkedList();
//        list.addElement(1);
//        list.addElement(2);
//        list.addElement(3);
//        linkedList =  list.addElement(4);
//
//        Stream<MyNode> stream = Stream.of(linkedList);
//        stream.forEach(System.out::println);
//
//        while (linkedList !=null){
//            System.out.println(linkedList.val);
//            linkedList = linkedList.ptr;
//        }
    }
}
