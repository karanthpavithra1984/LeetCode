package easy.Matrix;

public class LargestLocal {
    public int[][] largestLocal(int[][] grid) {
        int ROW = grid.length , COL = grid[0].length;
        int[][] result = new int[ROW-2][COL-2];

        for(int i= 0 ; i< result.length ; i++){
            for(int j= 0 ; j < result[0].length ; j++){
                result[i][j] = findMax(grid, i , j);
            }
        }

        return result;
    }

    private int findMax(int[][] grid, int rowStart, int colStart){
        int maxValue = Integer.MIN_VALUE;
        for(int i= rowStart ; i < rowStart + 3 ; i++){
            for(int j= colStart; j < colStart + 3; j++){
                maxValue = Math.max(maxValue, grid[i][j]);
            }
        }

        return maxValue;
    }
}
