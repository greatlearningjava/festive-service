package com.greatlearning.algo.treepractice;

public class Node {
    int item;
    Node left;
    Node right;

    public Node(int item, Node left, Node right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public Node(int item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("item=").append(item);
        sb.append(", left=").append(left);
        sb.append(", right=").append(right);
        sb.append('}');
        return sb.toString();
    }
}
