package leetcode;
import java.util.*;

public class BinaryTreeInorderTraversalRecursive {
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		
		System.out.println(inorderTraversal(t1));
		
	}
	
	public static void helper(TreeNode root, List<Integer> re){
        if(root == null){
            return;
        }
        helper(root.left, re);
        re.add(root.val);
        helper(root.right, re);
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<Integer>();
        if(root == null){
            return re;   
        }
        helper(root,re);
        return re;
    }
}
