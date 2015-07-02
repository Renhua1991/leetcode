package leetcode;

import java.util.Arrays;

public class ThreeSumCloset {
	public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length < 3){
            return 0;   
        }
        
        int min = Integer.MAX_VALUE;
        int val = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
               int start = i + 1;
               int end = nums.length - 1;
               while(start < end){
                    int sum = nums[i] + nums[start] + nums[end];
                    if(Math.abs(target - sum) < min){
                        min = Math.abs(target - sum);
                        val = sum;
                    }
                    
                    if(target == sum){
                        return val;
                    }else if(target > sum){
                        start++;
                    }else{
                        end--;
                    }
               }
        }
        
        return val;
    }

}
