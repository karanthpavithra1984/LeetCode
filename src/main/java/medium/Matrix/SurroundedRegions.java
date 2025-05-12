package medium.Matrix;

/**
 * Time Complexity is o(n*m) + o(n) + o(m-2)
 * Space complexity is borderos which is o(n*m)
 */

public class SurroundedRegions {
    private static int ROWS;
    private static int COLS;

    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;
        boolean[][] borderos = new boolean[ROWS][COLS];

        //Start with borders
        for (int row = 0; row < ROWS; row++) {
            dfs(board, row, 0, borderos); //First Column of each row
            dfs(board, row, COLS - 1, borderos); // Last Column of each row
        }

        //First column is already handled above , so we go with next and last but one
        for (int col = 1; col < COLS - 1; col++) {
            dfs(board, 0, col, borderos); //First  row of remaining columns
            dfs(board, ROWS - 1, col, borderos); // Last row of remaining column
        }

        //Once borderos are marked
        //Lets go through all the rows and columns and only mark those which are not borderos
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == 'O' && !borderos[row][col]) {
                    board[row][col] = 'X';
                }
            }
        }

    }

    private void dfs(char[][] board, int rowNumber, int colNumber, boolean[][] borderos) {
        if (rowNumber < 0 || colNumber < 0 || rowNumber >= ROWS || colNumber >= COLS || board[rowNumber][colNumber] != 'O' || borderos[rowNumber][colNumber]) {
            return;
        }

        borderos[rowNumber][colNumber] = true;

        dfs(board, rowNumber - 1, colNumber, borderos);
        dfs(board, rowNumber + 1, colNumber, borderos);
        dfs(board, rowNumber, colNumber - 1, borderos);
        dfs(board, rowNumber, colNumber + 1, borderos);
    }
}
