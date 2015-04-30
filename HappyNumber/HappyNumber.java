package leetcode;

import java.util.ArrayList;

public class HappyNumber {
	public boolean isHappy(int n) {
        if(n <= 0) return false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            if(n == 1) return true;
            else if(list.contains(n)) return false;
            else{
            	list.add(n);
                n = getSum(n);
            }
        }
        return false;
    }
    
    public int getSum(int x){
        int sum = 0;
        while(x > 0){
            sum += (x % 10) * (x % 10);
            x = x / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
