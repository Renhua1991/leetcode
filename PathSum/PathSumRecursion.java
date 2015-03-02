package leetcode;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class PathSumRecursion {
	public boolean hasPathSum(TreeNode root, int sum){
		if(root == null) return false;
		if(root.val == sum && root.left == null && root.right == null) return true;
		
		boolean l = root.left != null? hasPathSum(root.left, sum-root.val):false;
		boolean r = root.right != null? hasPathSum(root.right, sum-root.val):false;
		
		return l || r;
	}
}
