package leetcode;

public class JumpGame2 {
	public int jump(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;   
        }
        
        int maxcover = 0;
        int step = 0;
        int lastcover = 0;
        
        for(int i = 0; i <= maxcover && i < nums.length ; i++){
            if(i > lastcover){
                step++;
                lastcover = maxcover;
            }
            
            if(nums[i] + i > maxcover)
                maxcover = nums[i] + i;
        }
        
        if(maxcover < nums.length-1){
            return 0;
        }
        
        return step;
    }
}
