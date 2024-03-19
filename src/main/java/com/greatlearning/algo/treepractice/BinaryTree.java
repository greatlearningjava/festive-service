package com.greatlearning.algo.treepractice;

public class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }

    void printPreorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.item + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printPreorder(tree.root);
    }
}
