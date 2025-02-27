package medium.Array;

public class TicTacToe {
    int[] rows;
    int[] cols;
    int diagonal;
    int antiDiagonal;
    int matrixSize;

    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
        diagonal = 0;
        antiDiagonal = 0;
        matrixSize = n;
    }

    public int move(int row, int col, int player) {
        int value = player == 1? 1: -1;
        rows[row] += value;
        cols[col] +=  value;

        if(row == col){
            diagonal += value;
        }

        if(row + col  == matrixSize - 1){
            antiDiagonal += value;
        }


        if(Math.abs(rows[row]) == matrixSize || Math.abs(cols[col]) == matrixSize || Math.abs(diagonal) == matrixSize || Math.abs(antiDiagonal) == matrixSize){
            return player;
        }

        return 0;
    }
}
