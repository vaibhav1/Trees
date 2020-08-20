package com.vaibhav1.practice;

/**
 *
 * @author vaibhav.shukla
 *
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * It could also be known as Height of a Binary Tree
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
public class MaximumDepth {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) { this.val = val; }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return maxDepthUtil(root, 1);
    }

    private int maxDepthUtil(TreeNode root, int depth){
        if(root == null){
            return 0;
        } else if(root.left == null && root.right == null){
            return depth;
        } else{
            return Math.max(maxDepthUtil(root.left, depth+1), maxDepthUtil(root.right, depth+1));
        }
    }
}
