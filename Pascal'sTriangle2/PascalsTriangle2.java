package leetcode;

import java.util.*;

public class PascalsTriangle2 {
	public List<Integer> getRow(int rowIndex) {
        int[] temp = new int[rowIndex+1];
        
        // initialize int[] temp
        for(int i=0; i<=rowIndex; i++){temp[i]=1;}
        
        // get the (rowIndex+1)th row
        for(int k=2; k<=rowIndex; k++){
            for(int j=k-1; j>=1; j--){
                temp[j] += temp[j-1];
            }
        }
        
        // convert array to List<Integer>
        List<Integer> result = new ArrayList<Integer>();
        for(int x=0; x<=rowIndex; x++){
            result.add(temp[x]);
        }
        
        return result;
    }
}
