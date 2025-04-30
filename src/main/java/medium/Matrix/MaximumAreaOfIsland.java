package medium.Matrix;

public class MaximumAreaOfIsland {
    private int ROW;
    private int COL;
    public int maxAreaOfIsland(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;

        int maxArea = 0;
        boolean[][] visited = new boolean[ROW][COL];

        for(int r= 0; r< ROW; r++){
            for(int c=0; c< COL ; c++){
                if(grid[r][c] == 1 && !visited[r][c]){
                    int area = dfs(grid, r, c, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int row, int col, boolean[][] visited){
        if(row < 0 || row >= ROW || col < 0 || col >= COL || visited[row][col] || grid[row][col] == 0){
            return 0;
        }

        visited[row][col] = true;

        return 1+ dfs(grid, row+1, col, visited)
                + dfs(grid, row, col-1, visited)
                + dfs(grid, row, col+1, visited)
                + dfs(grid, row-1, col, visited);
    }
}
