package leetcode;

//don't create a new array.
public class MergeSortArray {
	public static void merge(int A[], int m, int B[], int n) {
		while(m>0 && n>0){
            if(A[m-1]>=B[n-1]){
                A[m+n-1]=A[m-1];
                m--;
            }else{
                A[m+n-1]=B[n-1];
                n--;
            }
        }
        while(m>0){
            A[m+n-1]=A[m-1];
            m--;
        }
        while(n>0){
            A[m+n-1]=B[n-1];
            n--;
        }
    }

}
