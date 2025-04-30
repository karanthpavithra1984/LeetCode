package medium.Matrix;

/**
 * Time Complexity o(m*n)
 * Space Complexity o(n)
 */

public class NumberOfIslands {
    int ROW;
    int COL;
    int[][] coords = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;

        boolean[][] visited = new boolean[ROW][COL];
        int numIslands = 0;

        for(int r=0; r<ROW; r++){
            for(int c=0; c< COL; c++){
                if(grid[r][c] == '1' && !visited[r][c]){
                    numIslands++;
                    dfs(grid, r, c,visited);
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int r, int c, boolean[][] visited){
        if(r < 0 || r >= ROW || c<0 || c>=COL || visited[r][c] || grid[r][c] == '0'){
            return;
        }

        visited[r][c] = true;
        for(int[] coord: coords){
            dfs(grid, r+coord[0] , c+coord[1], visited);
        }
    }
}