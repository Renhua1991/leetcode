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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        final TreeNode END = new TreeNode(0);
        queue.add(root);
        queue.add(END);

        ArrayList<Integer> list_level = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            
            if(temp == END){
                result.add(new ArrayList<Integer>(list_level));
                list_level.clear();
                if(!queue.isEmpty()) queue.add(END);
            }
            else{
                list_level.add(temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        
        return result;
        
    }
}
