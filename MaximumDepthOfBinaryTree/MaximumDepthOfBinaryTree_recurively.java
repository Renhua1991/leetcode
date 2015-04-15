package leetcode;

public class MaximumDepthOfBinaryTree_recurively {
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	 public int maxDepth(TreeNode root) {       
	    if(root == null) return 0;
	        
	    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	 }
	
}