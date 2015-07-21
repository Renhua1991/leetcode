package leetcode;
import java.util.*;

public class PermutationsRecursively {
	public List<List<Integer>> permute(int[] num) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> item = new ArrayList<Integer>();
        
        if(num.length == 0 || num == null){
            return res;
        }
    
        boolean[] visited = new boolean[num.length];  
        helper(num, res, item, visited);
    
        return res;
    }
    
    public void helper(int[] num, ArrayList<List<Integer>> res, List<Integer> item, boolean[] visited){
        if(item.size() == num.length){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        
        for(int i = 0; i < num.length; i++){
            if(!visited[i]){
                item.add(num[i]);
                visited[i] = true;
                helper(num, res, item, visited);
                item.remove(item.size() - 1);
                visited[i] = false;
            }
        }
    }
}
