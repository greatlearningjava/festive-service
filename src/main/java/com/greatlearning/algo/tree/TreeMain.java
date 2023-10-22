package com.greatlearning.algo.tree;

import java.util.Scanner;

public class TreeMain {

    public static void main(String[] args) {

//        Node root = usingUserChoice();
//        System.out.println("Traverse using the preorder");
//        preOrder_Traversal(root);
//        System.out.println("Traverse using the inorder");
//        inOrder_Traversal(root);
        int[] elements = {10, 5, 10, 2, 12, 30};
        createBinarySearhTree(elements);
        System.out.println("Traverse using the inorder");
        inOrder_Traversal(root);
        System.out.println("Traverse using the preorder");
        preOrder_Traversal(root);

    }

    private static void inOrder_Traversal(Node root) {
        if (root == null) {
            return;
        }
        inOrder_Traversal(root.left);
        System.out.print(root.value + " ");
        inOrder_Traversal(root.right);

    }

    private static void preOrder_Traversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder_Traversal(root.left);
        preOrder_Traversal(root.right);

    }

    public static Node createBinarySearhTree(int[] elements) {
        Node root = null;
        Scanner choice = new Scanner(System.in);
        //char ch = 'y';
        System.out.println("Enter the choice(y/n): ");

        int index = 0;

        while (index < elements.length) {
            System.out.println("Enter the Node Value: " + elements[index]);
            Node temp = new Node(elements[index]);
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
            index++;  // increment the index
        } // First while loop closed
        return root;
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
