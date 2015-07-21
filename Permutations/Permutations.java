package leetcode;
import java.util.*;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        
        if(nums.length == 0 || nums == null){
            return res;
        }
        
        for(int num : nums){
            int size = res.size();
            
            for(; size > 0; size--){
                List<Integer> now = res.poll();
                
                for(int i = 0; i <= now.size(); i++){
                    List<Integer> t = new ArrayList<Integer>(now);
                    t.add(i, num);
                    res.add(t);
                }
            }
        }
        
        return res;
    }
}
