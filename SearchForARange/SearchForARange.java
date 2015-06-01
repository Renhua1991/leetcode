package leetcode;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
        if(nums == null){
            return new int[]{-1, -1};
        }
        int low = 0, high = nums.length;
        while( low < high ){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                int _s = mid, _e = mid;
                while(_s - 1 >= 0 && nums[_s - 1] == target){
                    _s--;
                } 
                while(_e + 1 < nums.length && nums[_e + 1] == target){
                    _e++;
                } 
                return new int[]{_s, _e};
                
            }else if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid;
            }
        }
        return new int[]{-1, -1};
    }
}
