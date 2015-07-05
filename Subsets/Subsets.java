package leetcode;
import java.util.*;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums.length == 0){
            return res;
        }
        
        List<Integer> temp = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        for(int i = 1; i <= nums.length; i++){
            helper(nums, 0, i, res, temp);
        }
        
        res.add(new ArrayList<Integer>());
        
        return res;
    }
    
    private void helper(int[] nums, int start, int end, List<List<Integer>> res, List<Integer> temp){
        if(temp.size() == end){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            helper(nums, i + 1, end, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
