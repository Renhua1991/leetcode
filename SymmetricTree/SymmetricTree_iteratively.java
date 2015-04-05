package leetcode;

import java.util.LinkedList;

public class SymmetricTree_iteratively {
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        LinkedList<TreeNode> lt = new LinkedList<TreeNode>();
        LinkedList<TreeNode> rt = new LinkedList<TreeNode>();
        lt.add(root.left);
        rt.add(root.right);
        
        while(!lt.isEmpty() && !rt.isEmpty() ){
            TreeNode temp1 = lt.poll();
            TreeNode temp2 = rt.poll();
            
            if(temp1 == null && temp2 !=null || temp1 != null && temp2 == null) return false;
            if(temp1 != null){
                if(temp1.val != temp2.val) return false;
                lt.add(temp1.left);
                lt.add(temp1.right);
                rt.add(temp2.right);
                rt.add(temp2.left);
            }
        }
        
        return true;
    }
}
