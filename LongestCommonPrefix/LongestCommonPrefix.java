package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        String first = strs[0];
        int length = strs.length;
        char[] atFirst = first.toCharArray();
        String str = first;
        
        for(int i = 1; i < length; i++){
            char[] now = strs[i].toCharArray();
            int j = (now.length <= str.length()) ? now.length : str.length();
            int k = 0;
            for(; k < j; k++){
                if(now[k] != atFirst[k]){
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int m = 0; m < k; m++){
                sb.append(atFirst[m]);
            }
            str = sb.toString();
        }
        
        return str;
    }
	
}
