package medium.Matrix;

public class NumberOfEnclaves {
    private int ROWS;
    private int COLS;

    public int numEnclaves(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        boolean[][] visited = new boolean[ROWS][COLS];
        int count=0;
        //Run a dfs on border rows
        for(int r = 0; r < ROWS; ++r){
            //First column of each row
            if(grid[r][0] ==  1 && !visited[r][0]){
                dfs(grid,r,0, visited);
            }
            //Last Column of each row
            if(grid[r][COLS-1] ==  1 && !visited[r][COLS-1]){
                dfs(grid,r,COLS-1, visited);
            }
        }

        //Run a dfs on border cols
        //You can exclude 1 and last since they are already taken care of
        for(int c = 1; c < COLS-1; ++c){
            //First column of each row
            if(grid[0][c] ==  1 && !visited[0][c]){
                dfs(grid,0,c, visited);
            }
            //Last Column of each row
            if(grid[ROWS-1][c] ==  1 && !visited[ROWS-1][c]){
                dfs(grid,ROWS-1,c, visited);
            }
        }

        //Once all the dfs from the border rows are taken care of ,
        //Go through the list which are untouched. They are the ones who are not connected to borders.

        for(int r = 0; r < ROWS; ++r){
            for(int c = 0; c < COLS; ++c){
                if(grid[r][c] ==  1 && !visited[r][c]){
                    count++;
                }
            }
        }

        return count;
    }


    private void dfs(int[][] grid, int r, int c, boolean[][] visited){
        if(r < 0 || r >= ROWS | c < 0 || c >= COLS || visited[r][c] || grid[r][c] == 0){
            return;
        }

        //Run for all the rows.
        visited[r][c] = true;
        dfs(grid, r+1, c, visited);
        dfs(grid, r-1, c, visited);
        dfs(grid, r, c+1, visited);
        dfs(grid, r, c-1, visited);
    }
}
