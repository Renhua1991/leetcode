package leetcode;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        
        for(int i = 0; i < l; i++){
            while(nums[i] != i + 1){
                if(nums[i] <= 0 || nums[i] >= l){
                    break;
                }
                
                if(nums[i] == nums[nums[i] - 1]){
                    break;
                }
                
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        
        for(int j = 0; j < l; j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        
        return l + 1;
    }
}
