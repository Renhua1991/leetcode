package leetcode;
import java.util.*;

public class CombinationSum3 {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new  ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        if(n <= 0){
            return result;
        }
        
        helper(result, temp, k, n, 1);
        
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> temp, int k, int n, int index) {
    	if (k == 0) {
            if (n == 0){
                result.add(new ArrayList<Integer>(temp));
            }
                
            return;
        }
        
        for (int i = index; i <= n / k && i < 10; i++) {
            temp.add(i);
            helper(result, temp, k - 1, n - i, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
