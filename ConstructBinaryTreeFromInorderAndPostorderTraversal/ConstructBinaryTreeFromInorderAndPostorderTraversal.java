package leetcode;
import java.util.Arrays;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length){
            return null;
        }
        
        int val_head = postorder[postorder.length - 1];
        TreeNode head = new TreeNode(val_head);
        
        int pos = helper(inorder, val_head);
        
        int[] left_inorder = Arrays.copyOfRange(inorder, 0, pos);
        int[] right_inorder = Arrays.copyOfRange(inorder, pos + 1, inorder.length);
        int[] left_postorder = Arrays.copyOfRange(postorder, 0, pos);
        int[] right_postorder = Arrays.copyOfRange(postorder, pos , postorder.length - 1);
        
        head.left = buildTree(left_inorder, left_postorder);
        head.right = buildTree(right_inorder, right_postorder);
        
        return head;
    }
    
    private int helper(int[] array, int val){
        for(int i = 0; i < array.length; i++){
            if(array[i] == val){
                return i;
            }
        }
        
        return -1;
    }
}
