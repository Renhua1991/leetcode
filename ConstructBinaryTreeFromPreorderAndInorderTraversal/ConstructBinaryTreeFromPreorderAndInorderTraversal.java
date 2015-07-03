package leetcode;
import java.util.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length){
            return null;
        }
        
        int head = preorder[0];
        TreeNode root = new TreeNode(head);
        
        int pos = helper(inorder, head);
        
        int[] left_inorder = Arrays.copyOfRange(inorder, 0, pos);
        int[] right_inorder = Arrays.copyOfRange(inorder, pos + 1, inorder.length);
        int[] left_preorder = Arrays.copyOfRange(preorder, 1, pos + 1);
        int[] right_preorder = Arrays.copyOfRange(preorder, pos + 1, preorder.length);
        
        root.left = buildTree(left_preorder, left_inorder);
        root.right = buildTree(right_preorder, right_inorder);
        
        return root;
    }
    
    private int helper(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        
        return -1;
    }
}
