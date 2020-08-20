package com.vaibhav1.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vaibhav.shukla
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
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
 *  /  \    / \
 * 7    2  5   1
 * Return:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class PathSumII {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) { this.val = val; }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        hasPathSum(root, new ArrayList<Integer>(), paths, sum);
        return paths;
    }

    private void hasPathSum(TreeNode root, List<Integer> curr, List<List<Integer>> paths, int sum){

        if(root == null){
            return;
        }
        curr.add(root.val);
        if(root.left == null && root.right == null && sum-root.val == 0){

            paths.add(curr);
            return;
        }
        hasPathSum(root.left, new ArrayList<Integer>(curr), paths, sum-root.val);
        hasPathSum(root.right, new ArrayList<Integer>(curr), paths, sum-root.val);
    }
}
