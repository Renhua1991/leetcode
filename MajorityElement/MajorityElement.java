package leetcode;

import java.util.*;

public class MajorityElement {
	public int majorityElement(int[] num) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i=0; i<num.length; i++){
            int k = num[i];
            if(!ht.containsKey(k)){
                ht.put(k,1);
            }else{
                int count=ht.get(k);
                ht.put(k, count+1);
            }
        }
        
        int result = 0;
        for(int key: ht.keySet()){
            if(ht.get(key) > num.length/2) result=key;
        }       
        return result;
    }
}
