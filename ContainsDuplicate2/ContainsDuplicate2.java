package leetcode;

import java.util.HashMap;

public class ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i - map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
