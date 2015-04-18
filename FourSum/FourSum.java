package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(num.length<4) return result;
        Arrays.sort(num);

        int l = num.length;
        for(int i=0; i<l-3; i++){
            if(i>0 && num[i]==num[i-1]) continue;
            for(int k=i+1;k<l-2; k++){
                if(k>i+1 && num[k]==num[k-1]) continue;
                int start=k+1;
                int end=l-1;
                while(start<end){
                    if(num[start]+num[end]+num[i]+num[k] == target){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[k]);
                        temp.add(num[start]);
                        temp.add(num[end]);
                        result.add(temp);
                        start++;
                        end--;
                        while(start<end && num[start]==num[start-1]) start++;
                        while(start<end && num[end]==num[end+1]) end--;
                    }
                    else if(num[start]+num[end]+num[i]+num[k] > target) end--;
                    else start++;
                }
            }
        }
        return result;
    }
}
