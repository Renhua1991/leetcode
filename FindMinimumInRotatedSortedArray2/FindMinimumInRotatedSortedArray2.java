package leetcode;

public class FindMinimumInRotatedSortedArray2 {
	public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length -1;
        if (nums.length == 1){
            return nums[0];   
        }
    
        return findMin(nums, low, high);
    
    }
    
    public int findMin(int[] num, int low, int high) {
        if (low == high){
            return num[low];   
        }
    
        int mid = (low + high) / 2;
        
        if (num[mid] < num[high]) {
            return findMin(num, low, mid);
            
        } else if (num[mid] > num[high]) {
            return findMin(num, mid + 1, high);
            
        } else { // num[mid] == num[high] 
            // in this case, the minimal element can be on either side.
            int minLeft = findMin(num, low, mid);
            int minRight = findMin(num, mid+1, high);
    
            return Math.min(minLeft, minRight);
        }
    
    }
}
