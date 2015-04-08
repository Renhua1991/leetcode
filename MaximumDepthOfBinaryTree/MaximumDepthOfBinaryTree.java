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

import java.util.LinkedList;
import java.util.ListIterator;

public class MaximumDepthOfBinaryTree {
	
	public int maxDepth(TreeNode root) {
        LinkedList<Integer> value = new LinkedList<Integer>();
        LinkedList<TreeNode> node = new LinkedList<TreeNode>();
        LinkedList<Integer> big = new LinkedList<Integer>();
        if(root == null) return 0;
        value.add(1);
        big.add(1);
        node.add(root);
        
        while(!node.isEmpty()){
            TreeNode temp = node.poll();
            int num = value.poll();
            System.out.println(value);
           
            if(temp.left != null){
                value.add(num + 1);
                big.add(num + 1);
                node.add(temp.left);
            }
            
            if(temp.right != null){
                value.add(num + 1);
                big.add(num + 1);
                node.add(temp.right);
            }
        }
        int max = 0;
        System.out.println(big);
        ListIterator<Integer> itr = big.listIterator();
        while(itr.hasNext()){
            int re = itr.next();
            if(re > max) max = re;
        }
        return max;
    }
}
