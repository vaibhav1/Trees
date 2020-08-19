/**
 *
 */
package com.vaibhav1.practice;

/**
 * @author vshukla
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 * Example 1:
 *
 *     2
 *    / \
 *   1   3
 *
 * Input: [2,1,3]
 * Output: true
 *
 *
 * Example 2:
 *
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 *
 * Input: [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 */
public class CheckIfBST {


	class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int val) { this.val = val; }
	}

	public boolean isValidBST(TreeNode root) {
		return validateBST(root, null, null);
	}

	private boolean validateBST(TreeNode root, Integer min, Integer max){
		if(root == null){
			return true;
		}else if(min!=null && root.val<=min || max!=null && root.val>=max){
			return false;
		} else {
			return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
		}
	}

}
