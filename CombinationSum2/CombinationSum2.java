package leetcode;
import java.util.*;

public class CombinationSum2 {
	private List<List<Integer>> result;
    private List<Integer> cur;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<List<Integer>>();
        cur = new ArrayList<Integer>();
        
        if(candidates.length == 0){
            return result;
        }
        
        helper(candidates, target, 0);
        
        return result;
    }
    
    private void helper(int[] candidates, int target, int index){
        if(target == 0){
            ArrayList<Integer> temp = new ArrayList<Integer>(cur);
            
            Collections.sort(temp);
            
            if(!result.contains(temp)){
                result.add(temp);
            }
            
        }else if(target < 0){
            return;
            
        }else{
            while(index < candidates.length){
                int candidate = candidates[index];
                
                cur.add(candidate);
                helper(candidates, target - candidate, index + 1);
                cur.remove(cur.size() - 1);
                
                while(index < candidates.length && candidates[index] == candidate){
                    index++;
                }
            }
        }
    }
}
