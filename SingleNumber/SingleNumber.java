package leetcode;

import java.util.Hashtable;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(ht.containsKey(nums[i])){
                ht.put(nums[i], ht.get(nums[i]) + 1);
            }
            if(!ht.containsKey(nums[i])){
                ht.put(nums[i], 1);
            }
        }
        int result = 0;
        for (int key : ht.keySet()) {
           if(ht.get(key) == 1){
               result = key;
           }
        }

        return result;
    }
}
