package leetcode;
import java.util.*;

public class Subsets2 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums.length == 0 || nums == null){
            return res;
        }
        
        List<Integer> item = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        for(int i = 1; i <= nums.length; i++){
            helper(nums, 0, i, res, item);
        }
        
        res.add(new ArrayList<Integer>());
        
        return res;
    }
    
    private void helper(int[] nums, int start, int len, List<List<Integer>> res, List<Integer> item){
        if(item.size() == len){
            if(!res.contains(item)){
                res.add(new ArrayList<Integer>(item));
            }
            
            return;
        }
        
        for(int i = start; i < nums.length; i++){
            item.add(nums[i]);
            helper(nums, i + 1, len, res, item);
            item.remove(item.size() - 1);
        }
    }
}
