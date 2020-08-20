package com.vaibhav1.practice;

/**
 * Find the height of a binary tree
 *
 * The height of the binary tree is the longest path from root node to any leaf node in the tree
 */
public class Height {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) { this.val = val; }
    }

    public int height(TreeNode root){
        if(root == null )
            return 0;
        return 1+Math.max(height(root.left), height(root.right));

    }
}


