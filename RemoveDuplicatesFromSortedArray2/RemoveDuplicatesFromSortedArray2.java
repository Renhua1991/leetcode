package leetcode;

public class RemoveDuplicatesFromSortedArray2 {
	public int removeDuplicates(int[] A) {
        if(A.length < 2) return A.length;
        int dup = 1;
        int j = 0;
        
        for(int i = 1; i < A.length; i++){
            if(A[i] == A[i-1]){
                dup++;
            }else{
                dup = 1;
            }
            if(dup <= 2){
                j++;
                A[j] = A[i];
                
            }
            
        }
        
        return j+1;
    }

}
