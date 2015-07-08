package leetcode;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int front = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        while(end < nums.length){
            while(sum < s && end < nums.length){
                sum += nums[end];
                end++;
            }
            
            while(sum >= s && front < nums.length){
                min = Math.min(min, end - front);
                sum -= nums[front];
                front++;
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
