package com.algoexpert;

/**
 * Created by dabidi on 7/27/19.
 */
public class BST {
    /**
     *
     *       Write a Binary Search Tree (BST) class. The class should have a "value" property set to be an integer,
     *       as well as "left" and "right" properties, both of which should point to either the None (null) value or
     *       to another BST. A node is said to be a BST node if and only if it satisfies the BST property: its value is
     *       strictly greater than the values of every node to its left; its value is less than or equal to the values
     *       of every node to its right; and both of its children nodes are either BST nodes themselves or None (null)
     *       values. The BST class should support insertion, searching, and removal of values. The removal method should
     *       only remove the first instance of the target value.
     */
    private int value;
    private BST left;
    private BST right;

    public BST (int value){
        //TODO
        this.value = value;
    }

    public BST insert (int value){

        if(this.value > value && this.left == null){
            this.left  = new BST(value);
        }else if (this.value <= value && this.right == null) {
            this.right = new BST(value);
        }else if (this.value > value && this.left != null){
            return this.left.insert(value);
        }else if (this.value <= value && this.right != null){
            return this.right.insert(value);
        }
        return this;
    }

    public boolean contains(int value){
        if(this.value ==  value){
            return Boolean.TRUE;
        }else if (this.value > value && this.left != null){
            return this.left.contains(value);
        }else if (this.value > value && this.left == null){
            return Boolean.FALSE;
        }
        else if (this.value <= value && this.right != null){
            return this.right.contains(value);

        }else if (this.value <= value && this.right == null){
            return Boolean.FALSE;

        }else{
            return Boolean.FALSE;
        }
    }

    public BST remove(int value){ // 10, 5, 2
        if(this.value == value && this.left == null){
            this.value = -1;
        }else if (this.value == value && this.left != null){
            return this.left;
        }

        else if (this.value > value && this.left != null){
            if(this.left.value ==value){
                this.left.value =-1;
            }else{
                return this.left.remove(value);
            }
        }else if (this.value<= value && this.right != null){
            if(this.right.value == value){
                this.right.value = -1;
            }else{
                return this.right.remove(value);
            }
        }
        return this;
    }

}
