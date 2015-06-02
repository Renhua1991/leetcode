package leetcode;

import java.util.LinkedList;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
        LinkedList<Integer> value = new LinkedList<Integer>();
        LinkedList<TreeNode> node = new LinkedList<TreeNode>();
        value.add(1);
        node.add(root);
        if(root == null){
            return 0;
        }
        
        while(!node.isEmpty()){
            TreeNode temp = node.poll();
            int number = value.poll();
            if(temp.left != null){
                value.add(number + 1);
                node.add(temp.left);
            }
            if(temp.right != null){
                value.add(number + 1);
                node.add(temp.right);
            }
            if(temp.left == null && temp.right == null){
                return number;
            }
        }
        
        return 0;
    }
}
