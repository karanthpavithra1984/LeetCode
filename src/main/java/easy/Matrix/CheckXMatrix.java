package easy.Matrix;

public class CheckXMatrix {
    public boolean checkXMatrix(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (i == j || j == COL - 1 - i) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else if (grid[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
