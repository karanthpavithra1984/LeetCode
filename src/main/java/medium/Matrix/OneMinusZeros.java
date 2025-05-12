package medium.Matrix;

public class OneMinusZeros {
    public int[][] onesMinusZeros(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        int[] onesRow = new int[ROW];
        int[] onesCol = new int[COL];

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                onesRow[r] += grid[r][c];
                onesCol[c] += grid[r][c];
            }
        }

        int[][] diff = new int[ROW][COL];
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                int zerosRow = ROW - onesRow[r];
                int zerosCol = COL - onesCol[c];

                diff[r][c] = onesRow[r] + onesCol[c] - zerosRow - zerosCol;
            }
        }

        return diff;
    }
}
