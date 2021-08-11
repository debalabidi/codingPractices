package com.practice.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dabidi on 10/18/19.
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal app = new BinaryTreeLevelOrderTraversal();
        TreeNode input = new TreeNode(3);
        input.left = new TreeNode(9);
        input.right = new TreeNode(20);
        input.right.left = new TreeNode(15);
        input.right.right = new TreeNode(7);
        app.levelOrder(input);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<com.practice.leetcode.TreeNode> bfs = new LinkedList<>();
        if(root != null){
            bfs.add(root);
            for(int i = 0 ; i < bfs.size(); i++){
                com.practice.leetcode.TreeNode currentNode =  bfs.get(i);
                if(currentNode.left != null)
                    bfs.add(root.left);
                if(currentNode.right != null)
                    bfs.add(root.right);
            }
        }else{
            return result;
        }

        for(int i = 0; i < bfs.size(); i++){
            List<Integer> rowResult = new LinkedList<Integer>();
            if(i == 0){
                rowResult.add(bfs.get(i).val);
            }else{
                rowResult.add(bfs.get(2*i+1).val);
                rowResult.add(bfs.get(2*i+2).val);
            }
            result.add(rowResult);

        }
        return result;



    }


}



