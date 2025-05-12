package medium.Matrix;

public class CountBattleShips {
    public int countBattleships(char[][] board) {
        int count = 0;
        int ROWS = board.length;
        int COLS = board[0].length;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'X') {
                    //If its the last row or  if the next right element is '.'
                    if ((row == ROWS - 1 || board[row][col + 1] == '.')
                            && (col == COLS - 1 || board[row + 1][col] == '.')) { //if last col or bottom element is '.'
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
