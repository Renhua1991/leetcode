package leetcode;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        int[] result = new int[n+1];
        result[0] = 1;
        for(int num = 1; num <= n; num++){
            for(int i = 0; i < num; i++){
                result[num] += result[i] * result[num - 1 -i];
            }
        }
        
        return result[n];
    }
}
