package leetcode;
import java.util.*;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1){
            return triangle.get(0).get(0);
        }
        
        int[] sum = new int[triangle.size()];
        
        for(int i = triangle.size() - 1; i >= 0; i--){
            if(i == triangle.size() - 1){
                for(int j = 0; j < triangle.get(triangle.size() - 1).size(); j++){
                    sum[j] = triangle.get(triangle.size() - 1).get(j);
                }
                continue;
            }
            
            for(int k = 0; k < triangle.get(i).size(); k++){
                sum[k] = Math.min(sum[k], sum[k + 1]) + triangle.get(i).get(k);
            }
        }
        
        return sum[0];
    }
}
