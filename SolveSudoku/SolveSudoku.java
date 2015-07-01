package leetcode;

public class SolveSudoku {
	public static void main(String[] args){
		char[][] test = {
				{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
				{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
				};
		
		for(int i = 0; i < test.length; i++){
			for(int j = 0; j < test[0].length; j++){
				System.out.print(test[i][j] + "  ");
			}
			System.out.println();
		}
		
		solveSudoku(test);
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < test.length; i++){
			for(int j = 0; j < test[0].length; j++){
				System.out.print(test[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	public static void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        solve(board);
    }

    public static boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
            	//System.out.println(board[i][j]);
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9 for each cell
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell

                            if(solve(board)){
                            	return true; //If it's the solution return true
                            }
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int i, int j, char c){
        //Check colum
        for(int row = 0; row < 9; row++)
            if(board[row][j] == c)
                return false;

        //Check row
        for(int col = 0; col < 9; col++)
            if(board[i][col] == c)
                return false;

        //Check 3 x 3 block
        for(int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
            for(int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
                if(board[row][col] == c)
                    return false;
        return true;
    }
}
