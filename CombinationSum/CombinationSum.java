package leetcode;
import java.util.*;

public class CombinationSum {
	private List<List<Integer>> result;
    private List<Integer> cur;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<List<Integer>>();
        cur = new ArrayList<Integer>();
        
        if(candidates.length == 0){
            return result;
        }
        
        Arrays.sort(candidates);
        
        helper(candidates, target, 0);
        
        return result;
    }
    
    private void helper(int[] candidates, int target, int index){
        if(target < 0){
            return;
        }else if(target == 0){
            result.add(new ArrayList<Integer>(cur));
        }else{
            while(index < candidates.length){
                int candidate = candidates[index];
                cur.add(candidate);
                helper(candidates, target - candidate, index);
                cur.remove(cur.size() - 1);
                
                while(index < candidates.length && candidates[index] == candidate){
                    index++;
                }
            }
        }
    }
}
