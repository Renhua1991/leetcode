package leetcode;

public class ClimbingChairs {
	public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int[] solutions = new int[n+1];
        solutions[0] = 0;
        solutions[1] = 1;
        solutions[2] = 2;
        for(int i = 3; i <= n; i++){
            solutions[i] = solutions[i-1] + solutions[i-2];
        }
        
        return solutions[n];
    }
}
