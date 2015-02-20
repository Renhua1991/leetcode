package leetcode;

public class ReverseInteger {
	public int reverse(int x) {
        //if x is 0, return;
        if(x==0) return x;

        int abs = 0;
        if(x < 0){
            abs = 1;
            x = -x;
        } 
        
        int rev = 0;
        int t = 0;
        while(x!=0){
            t = rev*10 + x%10;
            if((t-x%10)/10 != rev) return 0;
            else rev = t;
            x = x/10;
        }
        
        if(abs == 1) return -rev;
        else return rev;
    }
}
