package medium.Array;

public class FindWinnerTicTatToe {
    /**
     * Time Complexity o(m)
     * Space Complexity o(n)
     * @param moves
     * @return
     */
    public String tictactoe(int[][] moves) {
        int player = 1; //Let A be 1 and B be -1

        //Define rows and cols
        int n = 3;
        //You are basically recording moves for rows, cols, diagonal and antiDiagnol
        int[] rows = new int[n];
        int[] cols = new int[n];
        int diag = 0;

        //Anti diagonal is col+row =2 , i.e col+row+1 = 3
        int antiDiag = 0;

        for(int i = 0 ; i < moves.length ; i++){
            int row = moves[i][0];
            int col = moves[i][1];

            rows[row]+= player;
            cols[col]+= player;

            if(row == col){
                diag+= player;
            }

            if(row+col+1==n){
                antiDiag+= player;
            }

            //Check all
            if(Math.abs(rows[row]) == n || Math.abs(cols[col]) == n
                || Math.abs(diag) == n || Math.abs(antiDiag) == n){
                return player == 1? "A":"B";
            }

            player *= -1;
        }

        return moves.length == n*n ? "Draw":"Pending";
    }
}
