package leetcode;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args){
		String s = "abcb";
		lengthOfLongestSubstring("abacdb");
		//System.out.println(lengthOfLongestSubstring("abacdb"));
	}
	public static int lengthOfLongestSubstring(String s) {
    	boolean[] flag = new boolean[256];
        
    	int result = 0;
    	int start = 0;
    	char[] arr = s.toCharArray();
     
    	for (int i = 0; i < arr.length; i++) {
    		char current = arr[i];
    		if (flag[current]) {
    			result = Math.max(result, i - start);
    			System.out.println(result);
    			for (int k = start; k < i; k++) {
    				if (arr[k] == current) {
    					start = k + 1; 
    					break;
    				}
    			}
    		}else{
    			flag[current] = true;
    		}
    	}
     
    	result = Math.max(arr.length - start, result);
    	System.out.println("!!" + result);
    	return result;
    }
}
