package com.greatlearning.algo.tree;

import java.util.Scanner;

public class TreeMain {

    public static void main(String[] args) {
//        Node node = new Node(10);
//        Node left = new Node(5);
//        Node right = new Node(20);
//
//        node.left = left;
//        node.right = right;

        Node root = usingUserChoice();
        preOrder(root);
    }

    private static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static Node usingUserChoice() {
        Node root = null;
        Scanner choice = new Scanner(System.in);
        //char ch = 'y';
        System.out.println("Enter the choice(y/n): ");
        char ch = choice.next().charAt(0);

        while (ch == 'y') {
            Scanner scanner = new Scanner(System.in);
            //int value = 10;
            System.out.println("Enter the Node Value: ");
            int value = scanner.nextInt();
            Node temp = new Node(value);
            if (root == null) {
                root = temp;
            } else {
                Node prev = null;
                Node head = root;

                while (head != null) {
                    prev = head;
                    if (temp.value < head.value) {
                        head = head.left;
                    } else if (temp.value > head.value) {
                        head = head.right;
                    }
                }  // while loop closed

                if (temp.value < prev.value) {
                    prev.left = temp;
                } else if (temp.value > prev.value) {
                    prev.right = temp;
                }
            }
            System.out.println("Enter the choice(y/n): ");
            ch = choice.next().charAt(0);
        } // First while loop closed
    return root;
    }

}
