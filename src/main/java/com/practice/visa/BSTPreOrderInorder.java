package com.practice.visa;

import java.util.HashMap;

/**
 * Created by dabidi on 8/13/19.
 */
public class BSTPreOrderInorder {

        // start from first preorder element
        int pre_idx = 0;
        int[] preorder;
        int[] inorder;
        HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

        public TreeNode helper(int in_left, int in_right) {
            // if there is no elements to construct subtrees
            if (in_left == in_right)
                return null;

            // pick up pre_idx element as a root
            int root_val = preorder[pre_idx];
            TreeNode root = new TreeNode(root_val);

            // root splits inorder list
            // into left and right subtrees
            int index = idx_map.get(root_val);

            // recursion
            pre_idx++;
            // build left subtree
            root.left = helper(in_left, index);
            // build right subtree
            root.right = helper(index + 1, in_right);
            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            this.inorder = inorder;

            // build a hashmap value -> its index
            int idx = 0;
            for (Integer val : inorder)
                idx_map.put(val, idx++);
            return helper(0, inorder.length);
        }

    public static void main(String[] args) {
        int [] preorder = {3,9,20,15,7};
        int [] inorder =  {9,3,15,20,7};
    }

    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }

}
