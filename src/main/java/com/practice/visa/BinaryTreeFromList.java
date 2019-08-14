package com.practice.visa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by dabidi on 8/9/19.
 */
public class BinaryTreeFromList {
    private BST node = null;

    public static void main(String[] args) {
        System.out.println("BinaryTreeFromList.main.start");
        BinaryTreeFromList app = new BinaryTreeFromList();
        app.constructBSTFromList(app.setUpData3(new ArrayList<Integer>()));
        System.out.println("BinaryTreeFromList.main.end");

    }

    public BST constructBSTFromList(List<Integer> input){
        System.out.println("BinaryTreeFromList.constructBSTFromList.start");
        //{5, 3, 7 , 3,1,4, 7,6,9, 1,null, null, 4, null, null, 6, null, null, 9, null, null}
        System.out.println("input.size() = " + input.size());
        if(input.size() == 0){
            return null;
        }else{
            for (int i = 0; i < input.size(); i++) {
                node = insert(node, input.get(i));
            }
        }
        printBinaryTreeByLevel(node);
        System.out.println("BinaryTreeFromList.constructBSTFromList.end");

        return node;
    }

    private List<Integer> setUpData3(List<Integer> inputList) {
        inputList.add(5);
        inputList.add(3);
        inputList.add(7);
//        inputList.add(3);
        inputList.add(1);
        inputList.add(4);
//        inputList.add(7);
        inputList.add(6);
        inputList.add(9);
//        inputList.add(1);
//        inputList.add(null);
//        inputList.add(null);
//        inputList.add(4);
//        inputList.add(null);
//        inputList.add(null);
//        inputList.add(6);
//        inputList.add(null);
//        inputList.add(null);
//        inputList.add(9);
//        inputList.add(null);
//        inputList.add(null);
        return inputList;
    }

    private static void printBinaryTreeByLevel(BST root) {
        System.out.println("BinaryTreeFromList.printBinaryTreeByLevel.start");
        if (root == null){
            System.out.println("root is null");
            return;
        }
        // Create an empty queue for level order tarversal
        Queue<BST> q =new LinkedList<BST>();
        q.add(root);
        while (true){
            int nodeCount = q.size();
            if(nodeCount == 0){
                break;
            }
            while (nodeCount > 0){
                BST node = q.peek();
                System.out.print(node.val + " ");
                q.remove();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                nodeCount--;
            }
            System.out.println();
        }
        System.out.println("BinaryTreeFromList.printBinaryTreeByLevel.end");

    }

    public BST insert(BST node, Integer value){
        boolean inserted = false;
        BST tobeReturned = node;
        if (node == null){
            node = new BST(value);
            tobeReturned = node;
            inserted = true;
        }else{
            BST parentNode = node;
            BST currentNode = node;
            while(true){

                if(value != null){
                    if (currentNode.val > value){
                        if(currentNode.left == null ){
                            BST newNode = new BST(value);
                            currentNode.left = newNode;
                            break;
                        }else{
                            parentNode = currentNode;
                            currentNode = currentNode.left;
                        }
                    }else{
                        if(currentNode.right == null){
                            BST newNode = new BST(value);
                            currentNode.right = newNode;
                            break;
                        }else{
                            parentNode = currentNode;
                            currentNode = currentNode.right;

                        }
                    }
                }else{
                    break;
                }
            }
        }
        return tobeReturned;
    }



    public BST searchNode(BST head, int value){
        BST node = null;

        return node;
    }

    public boolean containsNode(int value){
        boolean contains = false;

        return contains;
    }

    public boolean deleteNode(BST node, int value){
        boolean deleted = false;

        return deleted;
    }

    class BST {
        private int val;
        private BST left;
        private BST right;

        public BST(int val) {
            this.val = val;
        }


    }

}






