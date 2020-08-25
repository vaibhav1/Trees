package com.vaibhav1.practice;


/**
 * @author vaibhav.shukla
 *
 * Given a binary tree, find the length of the longest consecutive sequence path.
 *
 * The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
 * The longest consecutive path need to be from parent to child (cannot be the reverse).
 *
 *
 * For example,
 *
 *    1
 *     \
 *      3
 *     / \
 *    2   4
 *         \
 *          5
 * Longest consecutive sequence path is 3-4-5, so return 3.
 *
 *    2
 *     \
 *      3
 *     /
 *    2
 *   /
 *  1
 * Longest consecutive sequence path is 2-3',not3-2-1', so return `2'.
 */
public class LongestConsecutiveSequence {


    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) { this.val = val; }
    }


    public int longestConsecutive(TreeNode root){
        int [] max = new int[1];

        findLongest(root, 0, 0, max);
        return max[0];
    }


    private void findLongest(TreeNode root, int count, int target, int[] max) {

        if(root == null){
            return ;
        } else if(root.val == target){
            count++;
        } else{
            count = 1;
        }

        max[0] = Math.max(max[0], count);
        findLongest(root.left, count, root.val+1, max);
        findLongest(root.right, count, root.val+1, max);
    }

}
