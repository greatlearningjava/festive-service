package com.greatlearning.algo.tree;

public class DeletionInBinarySearchTree {

    public static void main(String[] args) {

        int[] elements = {50, 10, 100, 2, 30, 75, 125, 60, 80, 110, 150, 77, 90};
        Node root = TreeMain.createBinarySearhTree(elements);
        System.out.println("Traverse using the inorder");
        TreeMain.inOrder_Traversal(root);
        int searchElement = 90;
        System.out.println("Search the element in BST:" + searchElement);
        search(root, searchElement);
        //System.out.println("\nIs it binary search tree:" + isBst);
    }

    /*
    BST = Binary Search Tree
     */
    private static void search(Node root, int k) {
        Node prev = null;
        Node temp = root;
        while(temp != null && temp.value != k){
            prev = temp;
            if(temp.value < k){
                temp = temp.right;
            }
            else if(temp.value > k){
                temp = temp.left;

            }
            if(temp == null) {
                System.out.println("Element does not exist");
                return;
            }else{
                System.out.println(k + " exists is tree");
                return;
            }

        }


    }

}
