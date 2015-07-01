package leetcode;

public class CountPrimes {
	public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }
        
        for(int j = 2; j * j < n; j++){
            if(!isPrime[j]){
                continue;
            }
            for(int k = j * j; k < n; k += j){
                isPrime[k] = false;
            }
        }
        
        int count = 0;
        for(int x = 2; x < n; x++){
            if(isPrime[x]){
                count++;
            }
        }
        
        return count;
    }
}
