package leetcode;

public class NumberOfIslands {
	int m, n;
    public int numIslands(char[][] grid) {
        if(grid == null){
            return 0;
        }
        int number = 0;
        m = grid.length;
        if(m == 0){
            return 0;
        }
        n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] != '1'){
                    continue;
                }
                number++;
                changeState(grid, i, j);
            }
        }
        return number;
    }
    public void changeState(char[][] array, int x, int y){
        if (x < 0 || x >= m || y < 0 || y >= n) return; 
        if(array[x][y] == '1'){
            array[x][y] = '2';
            changeState(array, x + 1, y);
            changeState(array, x - 1, y);
            changeState(array, x, y + 1);
            changeState(array, x, y - 1);
        }
        
    }
}
