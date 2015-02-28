package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        //for every row
        for(int i = 0; i < numRows; i++){
            
            List<Integer> temp = new ArrayList<Integer>();
            
            if(i == 0) {temp.add(1);}
            else if(i == 1) {
                temp.add(1);
                temp.add(1);
            }
            else{
                //the first element
                temp.add(1);
                
                //for the ith row from the third line
                for(int k = 1; k < i; k++){
                    temp.add(result.get(i-1).get(k-1) + result.get(i-1).get(k));
                }
                
                //the last element
                temp.add(1);
            }
            
            //append the temp to result
            result.add(temp);
        }
        
        return result;
    }
}
