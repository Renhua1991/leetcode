package leetcode;
import java.util.*;

public class PermutationSequnece {
	public String getPermutation(int n, int k) {
        if(n == 0){
            return "";
        }
        
        String res = "";
        List<Integer> num = new ArrayList<Integer>();
        
        for(int i = 0; i <= n; i ++){
            num.add(i);
        }
        
        int fac;
        int index;
        
        for(int i = n; i > 0; i--){
            fac = helper(i - 1);
    
            index = (int) Math.ceil(k / (double) fac);
            res += num.get(index);
            
            num.remove(index);
            
            k = k % fac;
            if(k == 0){
                k = fac;
            }
        }
        
        return res;
    }
    
    private int helper(int n){
        if(n == 0){
            return 1;
        }
        
        return n * helper(n - 1);
    }
}
