package leetcode;

public class MaximalRectangle {
	public int maximalRectangle(char[][] matrix) {
        if(matrix == null){
            return 0;
        }
        
        int result = 0;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                int area = helper(matrix, i, j);
                if(area > result){
                    result = area;
                }
            }
        }
        
        return result;
    }
    
    public int helper(char[][] matrix, int row, int col){
        int minWidth = Integer.MAX_VALUE;
        int maxArea = 0;
        
        for (int i = row; i < matrix.length && matrix[i][col] == '1'; i++) {
            int width = 0;
            
            while (col + width < matrix[row].length
                    && matrix[i][col + width] == '1') {
                width++;
            }
            
            if (width < minWidth) {
                minWidth = width;
            }
            
            int area = minWidth * (i - row + 1);
            
            if (area > maxArea)
                maxArea = area;
        }
        
        return maxArea;
    }
}
