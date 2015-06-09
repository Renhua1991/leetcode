package leetcode;

import java.util.Hashtable;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        
        Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        
        if(s_array.length != t_array.length){
            return false;
        }
        
        for(int i = 0; i < s_array.length; i++){
            if(ht.containsKey(s_array[i])){
                if(!ht.get(s_array[i]).equals(t_array[i])){
                    return false;
                }
            }
            if(!ht.containsKey(s_array[i])){
                if(ht.containsValue(t_array[i])){
                    return false;
                }
                ht.put(s_array[i], t_array[i]);
            }
        }
       
        return true;
    }
}
