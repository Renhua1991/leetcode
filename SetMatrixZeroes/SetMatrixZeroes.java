package leetcode;

public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        
        int[] isEmptyRow = new int[matrix.length];
        int[] isEmptyCol = new int[matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    isEmptyRow[i] = 1;
                    isEmptyCol[j] = 1;
                }
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(isEmptyRow[i] == 1 || isEmptyCol[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
