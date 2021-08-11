package com.practice.concept.binaryTree;


import com.algoexpert.BST;

import java.util.Stack;

/**
 * Created by dabidi on 9/17/19.
 */
public class PrintBinaryTree {
    public static void main(String[] args) {
        BST node = new BST(10);
        BST node1 = new BST(2);
        BST node2 = new BST(6);
        BST node3 = new BST(9);
        BST node4 = new BST(8);
        BST node5 = new BST(15);
        BST node6 = new BST(12);
        BST node7 = new BST(18);

        node2.left = node1;
        node4.left = node2;
        node4.right = node3;
        node.left = node4;
        node.right = node5;
        node5.left = node6;
        node5.right = node7;
//        print(node);
        printIteratively(node);
    }

    static void print(BST node) {
        if (node == null) {
            return;
        } else {

            if (node.left != null) {
                print(node.left);
            }
            if (node.right != null) {
                print(node.right);
            }
            System.out.println("node.val = " + node.val);

        }
    }

    static void printIteratively(BST node) {
        Stack<BST> nodes = new Stack<BST>();
        BST currentNode = node;
        while (nodes.size() > 0 || currentNode != null) {
            if (currentNode != null) {

                nodes.push(currentNode);
                currentNode = currentNode.left;
            }else{
                currentNode = nodes.pop();
                currentNode = currentNode.right;

            }
            if(currentNode != null)
            System.out.println("currentNode = " + currentNode.val);



        }
    }


    static class BST {
        int val;
        BST left;
        BST right;

        public BST(int val) {
            this.val = val;
        }
    }
}
