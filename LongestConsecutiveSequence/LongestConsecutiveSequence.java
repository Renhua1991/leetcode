package leetcode;
import java.util.*;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
        int longest = 0;
        
        if(nums.length == 0){
            return 0;
        }
        
        if(nums.length == 1){
            return 1;
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                continue;
            }
            
            map.put(nums[i], 1);
            
            int start = nums[i];
            int end = nums[i];
            
            if(map.containsKey(nums[i] + 1)){
                end = nums[i] + map.get(nums[i] + 1);
            }
            
            if(map.containsKey(nums[i] - 1)){
                start = nums[i] - map.get(nums[i] - 1);
            }
            
            longest = Math.max(longest, end - start + 1);
            
            map.put(end, end - start + 1);
            map.put(start, end - start + 1);
        }
        
        return longest;
    }
}
