package leetcode;

public class Palindrome {
	public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        String str = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<j){
            
            if(!Character.isLetterOrDigit(str.charAt(i))) i++;
            else if(!Character.isLetterOrDigit(str.charAt(j))) j--;
            else{
                if(str.charAt(i) != str.charAt(j)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
