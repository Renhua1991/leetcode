package leetcode;

public class ImplementstrStr {
	
	public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(haystack.equals(needle)) return 0;
        int length = needle.length();
        for(int i=0; i<=haystack.length()-length; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int k=i; k<i+length; k++){
                    if(haystack.charAt(k) != needle.charAt(k-i)){
                        break;
                    }
                    if(k==i+length-1){
                        return i;   
                    }
                }
            }
        }
        return -1;
    }
}
