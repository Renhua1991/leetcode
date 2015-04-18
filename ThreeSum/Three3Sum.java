package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three3Sum {
	public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(num.length<3) return result;
        int l = num.length;
        Arrays.sort(num);
        if(num[0]>0) return result;
        for(int i=0; i<l-2; i++){
            if(i==0 || num[i]>num[i-1]){
                int need = -num[i];
                int start = i+1;
                int end = l-1;
                while(start<end){
                    if(num[start] + num[end] == need){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[start]);
                        temp.add(num[end]);
                        result.add(temp);
                        start++;
                        end--;
                        //avoid duplicate result in List<List<Integer>>
                        while(start < end && num[start-1] == num[start]) start++;
                        while(start < end && num[end+1] == num[end]) end--;
                    }else if(num[start] + num[end] > need){
                        end--;
                    }else{
                        start++;
                    }
                }    
            }
            
        }
        
        return result; 
    }
}
