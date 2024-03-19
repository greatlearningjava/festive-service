package com.greatlearning.algo.revision.linkedlist;

public class MyNode {
    int val;
    MyNode ptr;

    public MyNode(int val) {
        this.val = val;
        this.ptr = null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyNode{");
        sb.append("val=").append(val);
        sb.append(", ptr=").append(ptr);
        sb.append('}');
        return sb.toString();
    }
}
