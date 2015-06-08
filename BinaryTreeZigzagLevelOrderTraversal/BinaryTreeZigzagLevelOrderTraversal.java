package leetcode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        
        LinkedList<TreeNode> node = new LinkedList<TreeNode>();
        node.add(root);
        TreeNode mark_positive = new TreeNode(Integer.MAX_VALUE);
        node.add(mark_positive);
        TreeNode mark_negative = new TreeNode(Integer.MIN_VALUE);
        
        List<Integer> line = new ArrayList<Integer>();
        while(!node.isEmpty()){
            TreeNode temp = node.poll();
            
            if(temp.left != null){
                node.add(temp.left);
            }
            if(temp.right != null){
                node.add(temp.right);    
            }
            if(temp.val != Integer.MAX_VALUE && temp.val != Integer.MIN_VALUE){
                line.add(temp.val);
            }
            if(temp.val == Integer.MAX_VALUE){
                result.add(new ArrayList<Integer>(line));
                if(!node.isEmpty()){
                    node.add(mark_negative);
                }
                line.clear();
            }
            if(temp.val == Integer.MIN_VALUE){
                Collections.reverse(line);
                result.add(new ArrayList<Integer>(line));
                if(!node.isEmpty()){
                    node.add(mark_positive);
                }
                line.clear();
            }
        }
        return result;
    }
}
