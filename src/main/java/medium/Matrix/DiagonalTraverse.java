package medium.Matrix;

public class DiagonalTraverse {
    private static int ROWS;
    private static int COLS;

    public int[] findDiagonalOrder(int[][] mat) {
        ROWS = mat.length;
        COLS = mat[0].length;
        int[] res = new int[ROWS * COLS];

        int row = 0, col = 0;
        // We move up if its r+c is even , consider this rectanle
        /**
         *
         *       reverse     r+c = 0            1  2  3  4  5
         *       forward      r+c == 1          6  7  8  9  10
         *       reverse     r+c == 2           11 12 13 14 15
         *       forward     r+c == 3           16 17 18 19 20
         */

        for (int i = 0; i < ROWS * COLS; i++) {
            res[i] = mat[row][col];

            //even is reverse
            if ((row + col) % 2 == 0) {
                if (col == COLS - 1) {
                    row++; // Start a forward from next row
                } else if (row == 0) {
                    col++; // Start a forward
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == ROWS - 1) {
                    col++; // start a reverse
                } else if (col == 0) {
                    row++; // start a reverse from next coolumn
                } else {
                    row++;
                    col--;
                }
            }
        }

        return res;
    }
}
