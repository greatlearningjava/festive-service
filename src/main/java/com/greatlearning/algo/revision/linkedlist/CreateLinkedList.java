package com.greatlearning.algo.revision.linkedlist;

public class CreateLinkedList {

    MyNode first;
    MyNode temp;
    MyNode head;

    public CreateLinkedList() {

    }

    public MyNode addElement(int val) {
        MyNode head = new MyNode(val);
        if(first == null) {
            first = head;
            temp = head;
        }else{
            temp.ptr = head;
            temp = head;
        }
        return first;
    }
}
