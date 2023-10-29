package com.greatlearning.algo.tree;

public class IsBinarySearchTree {

    public static void main(String[] args) {

        int[] elements = {10, 5, 15, 2, 12, 30};
        Node root = TreeMain.createBinarySearhTree(elements);
        System.out.println("Traverse using the inorder");
        TreeMain.inOrder_Traversal(root);
        boolean isBst = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("\nIs it binary search tree:" + isBst);
    }

    /*
    BST = Binary Search Tree
     */
    private static boolean isBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        } else {
            return root.value > min && root.value < max
                    && isBST(root.left, min, root.value)
                    && isBST(root.right, root.value, max);
        }
    }

}
