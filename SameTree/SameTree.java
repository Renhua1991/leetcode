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

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p != null && q != null && p.val == q.val){
            boolean x = isSameTree(p.left, q.left);
            boolean y = isSameTree(p.right, q.right);
            return x && y;
        }
        return false;
    }
}
