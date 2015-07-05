package leetcode;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(helper(board, word, 0, i, j, visited)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean helper(char[][] board, String word, int index, int row, int col, boolean[][] visited){
        if(index == word.length()){
            return true;
        }
        
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }
        
        if(visited[row][col]){
            return false;
        }
        
        if(board[row][col] != word.charAt(index)){
            return false;
        }
        
        visited[row][col] = true;
        
        boolean res = helper(board, word, index + 1, row + 1, col, visited) 
            || helper(board, word, index + 1, row - 1, col, visited)
            || helper(board, word, index + 1, row, col + 1, visited)
            || helper(board, word, index + 1, row, col - 1, visited);
            
        visited[row][col] = false;
        
        return res;
    }
}
