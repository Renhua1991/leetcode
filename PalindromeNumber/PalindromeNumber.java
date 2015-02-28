package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        int rev = 0;
        int z = x;
        
        while(z>0){
            int y = rev;
            rev *= 10;
            //judge if rev is overflow
            if(rev/10 != y) return false;
            rev += z%10;
            
            z = z/10;
        }
        
        if(rev == x) return true;
        else return false;
    }
}
