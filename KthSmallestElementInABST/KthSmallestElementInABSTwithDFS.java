package leetcode;
import java.util.*;

public class KthSmallestElementInABSTwithDFS {
	public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while(root != null){
            stack.push(root);
            root = root.left;
        }
        
        while(k != 0){
            TreeNode cur = stack.pop();
            k--;
            
            if(k == 0){
                return cur.val;
            }
            
            TreeNode right = cur.right;
            while(right != null){
                stack.push(right);
                right = right.left;
            }
        }
        
        return -1;
    }
}
