package leetcode;

import java.util.Hashtable;

public class TwoSum {
	
	public int[] twoSum(int[] numbers, int target) {
		if(numbers==null || numbers.length<2) return null;
        int[] result = new int[2];
        Hashtable<Integer, Integer> mark = new Hashtable<Integer, Integer>();
        for(int i=0; i<numbers.length; i++){
            if(mark.containsKey(target-numbers[i])){
                int first = mark.get(target-numbers[i]) + 1;
                int last = i + 1;
                result[0] = first;
                result[1] = last;
                return result;
            }
            mark.put(numbers[i], i);
        }
        return null;
    }
}
