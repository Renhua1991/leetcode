package leetcode;
import java.util.*;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(root == null){
            return res;
        }
        
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        while(root != null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        
        return res;
    }
}
