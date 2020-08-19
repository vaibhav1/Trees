package com.vaibhav1.practice;

import javax.swing.tree.TreeNode;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */


public class PathSum {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    /*
    helper recursive function
     */
    private boolean hasPathSumUtil(TreeNode root, int target, int sum){

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null && target+root.val == sum){
            return true;
        } else if(root.left == null && root.right == null && target+root.val != sum){
            return false;
        } else {
            return hasPathSumUtil(root.left, target+root.val, sum) || hasPathSumUtil(root.right, target+root.val, sum);

        }
    }

    //actual definition
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }
        return hasPathSumUtil(root, 0, sum);
    }
}
