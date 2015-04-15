package leetcode;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        int index1 = 0;
        int index2 = 0;
        if (A.length==0)  return 0;
        while( index1 < A.length ) {
            if ( A[index1]!=elem ) {
                A[index2] = A[index1];
                index2++;
            }       
            index1++;
        }
        return index2;
 
    }
}
