package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by dabidi on 10/15/19.
 */


class PostOrderTraversal {


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        } else {
            // postorderTraversalRecursiveHelper(root, result);
            postorderTraversalIterativeHelper(root, result);
            return result;
        }
    }

    public void postorderTraversalIterativeHelper(TreeNode root, List<Integer> result) {
        TreeNode currentNode = root;// [3,1,2]
        TreeNode itemToAdd = null;
        Stack<TreeNode> temp = new Stack();
        temp.push(currentNode);
        while (temp.size() > 0) {
            if (currentNode.left == null && currentNode.right == null) {
                itemToAdd = (TreeNode) temp.pop();
                result.add(itemToAdd.val);
            } else {
                if (currentNode.right != null) {
                    if (result.size() > 0 && currentNode.right.val == result.get(result.size() - 1)) {
                        itemToAdd = (TreeNode) temp.pop();
                        result.add(itemToAdd.val);
                    } else {
                        temp.push(currentNode.right);
                    }
                }
                else if (currentNode.left != null) {
                    if (result.size() > 0 && currentNode.left.val == result.get(result.size() - 1)) {
                        itemToAdd = (TreeNode) temp.pop();
                        result.add(itemToAdd.val);
                    } else {
                        temp.push(currentNode.left);
                    }
                }
            }

            if (!temp.empty())
                currentNode = temp.peek();

        }
    }

    public void postorderTraversalRecursiveHelper(TreeNode root, List<Integer> result) {
        if (root.left != null)
            postorderTraversalRecursiveHelper(root.left, result);
        if (root.right != null)
            postorderTraversalRecursiveHelper(root.right, result);
        result.add(root.val);

    }

    public static void main(String[] args) {
        PostOrderTraversal app = new PostOrderTraversal();
        TreeNode input = new TreeNode(3);
        input.left = new TreeNode(1);
        input.right = new TreeNode(2);
        List<Integer> result = app.postorderTraversal(input);
        System.out.println(Arrays.toString(result.toArray()));
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
