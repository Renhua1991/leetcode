package leetcode;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] array = new int[k];
        
        for(int i=0; i<k; i++){
            array[i] = nums[i+length-k];
        }
        
        for(int i=length-1; i>=k; i--){
            nums[i] = nums[i-k];
        }
        
        for(int i=0; i<k;i++){
            nums[i] = array[i];
        }
    }
	
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7,8,9};
		rotate(nums, 9);
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
	}
}
