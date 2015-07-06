package leetcode;

public class TrappingRainWater {
	public int trap(int[] height) {
        if(height.length <= 1){
            return 0;
        }
        
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        
        int max = height[0];
        left[0] = height[0];
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }
        
        right[height.length - 1] = height[height.length - 1];
        max = height[height.length - 1];
        for(int i = height.length - 2; i >= 0 ; i--){
            right[i] = Math.max(max, height[i]);
            max = Math.max(max, height[i]);
        }
        
        int sum = 0;
        for(int i = 1; i < height.length - 1; i++){
            int water = (Math.min(left[i], right[i]) - height[i]) * 1;
            
            if(water > 0){
                sum += water;
            }
        }
        
        return sum;
    }
}
