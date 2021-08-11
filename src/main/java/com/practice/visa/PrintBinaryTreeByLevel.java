package com.practice.visa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dabidi on 8/11/19.
 */
public class PrintBinaryTreeByLevel {
    public static void main(String[] args) {
        BST root = new BST(1);
        root.left = new BST(2);
        root.right = new BST(3);
        root.left.left = new BST(4);
        root.left.right = new BST(5);
        root.right.right = new BST(6);

//        printBinaryTreeByLevel(root);


    }

//    private static void printBinaryTreeByLevel(BST root) {
//        if (root == null){
//            return;
//        }
//        // Create an empty queue for level order tarversal
//        Queue<BST> q =new LinkedList<BST>();
//        q.add(root);
//        while (true){
//            int nodeCount = q.size();
//            if(nodeCount == 0){
//                break;
//            }
//            while (nodeCount > 0){
//                BST node = q.peek();
//                System.out.print(node.val + " ");
//                q.remove();
//                if(node.left != null){
//                    q.add(node.left);
//                }
//                if(node.right != null){
//                    q.add(node.right);
//                }
//                nodeCount--;
//            }
//            System.out.println();
//        }
//    }

    static class BST{
        int val;
        BST left;
        BST right;

        public BST (int val){
            this.val = val;
        }
    }

}
