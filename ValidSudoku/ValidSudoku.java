package leetcode;
import java.util.*;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        
        // Check for each row
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (set.contains(board[i][j])){
                    return false;
                }else if(board[i][j] != '.'){
                    set.add(board[i][j]);   
                }
            }
            set.clear();
        }
    
        // Check for each column
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (set.contains(board[i][j])){
                    return false;   
                }else if(board[i][j] != '.'){
                    set.add(board[i][j]);   
                }
            }
            set.clear();
        }
    
        // Check for each sub-grid
        for (int k = 0; k < 9; k++) {
            for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
                for (int j = (k % 3) * 3; j < (k % 3) * 3 + 3; j++) {
                    if (set.contains(board[i][j])){
                        return false;   
                    }else if(board[i][j] != '.'){
                        set.add(board[i][j]);   
                    }
                }
            }
            set.clear();
        }
        
        return true;
    }
}
