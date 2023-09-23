package com.greatlearning.algo.stack;

public class StackUsingLinkedList {

    Node top = null;

    void push(int item){
        Node head = new Node(item);
    }

    int pop(){
        if(top==null){
            System.out.println("Stack is underflow");
        }
        return 0;
    }
}
