package leetcode;

public class Sqrtx {
	public int mySqrt(int x) {
		if(x == 0){
            return 0;
        }
        
        if(x == 1){
            return 1;
        }
        
        int left = 1;
        int right = x / 2 + 1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(mid <= x / mid && mid + 1 > x / (mid + 1)){
                return mid;
            }
            
            if(mid > x / mid){
                right = mid ;
            } else {
                left = mid ;
            }
        }
        
        return 0;
    }
}
