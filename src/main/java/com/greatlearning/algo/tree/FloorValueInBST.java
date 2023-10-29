package com.greatlearning.algo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class FloorValueInBST {

    public static void main(String[] args) {

        int[] elements = {10, 5, 15, 2, 12, 30};
        Node root = TreeMain.createBinarySearhTree(elements);
        System.out.println("Traverse using the inorder");
        TreeMain.inOrder_Traversal(root);
        System.out.println("\nLevel order traversal");
        levelOrder_Traversal(root);
    }

    /*
    traverse the tree and keep adding the left and right element to queue.
     */
    private static void levelOrder_Traversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();

    }


}
