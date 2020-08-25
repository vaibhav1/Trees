package com.vaibhav1.practice;

/**
 *
 * @author vaibhav.shukla
 *
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 *
 *
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 */
public class KthSmallestInBST {


    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) { this.val = val; }
    }


    int count=1;
    int smallest;

    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }

        findKthSmallest(root, k);
        return smallest;
    }

    private void findKthSmallest(TreeNode root, int k){
        if(root == null){
            return;
        }

        findKthSmallest(root.left, k);
        if(count++ == k){
            smallest = root.val;
            return;
        }
        findKthSmallest(root.right, k);
    }
}
