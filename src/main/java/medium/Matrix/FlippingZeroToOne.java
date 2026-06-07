package medium.Matrix;

public class FlippingZeroToOne {
    public int matrixScore(int[][] grid) {
        int ROW = grid.length, COL = grid[0].length;

        for(int i=0; i < ROW; i++){
            //If first element in the row is 0, flip it to maximize the number
            if(grid[i][0] == 0) {
                for (int j = 0; j < COL; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        //Lets go to the columns.
        //Each rows first value is 1 , so it cant go more than that. Lets start with next column

        for(int j=1; j < COL; j++){
            int countZeros = 0;
            for(int i=0; i < ROW; i++){
                if(grid[i][j] == 0 ){
                    countZeros++;
                }
            }


            int numOfOne = ROW - countZeros;
            if(countZeros > numOfOne){
                for(int i= 0; i < ROW; i++){
                    grid[i][j] = 1- grid[i][j];
                }
            }
        }

        int totalScore  = 0;
        for(int i = 0 ; i < ROW; i++){
            for(int j= 0 ; j < COL ; j++){
                //Ask google gemini.
                totalScore += grid[i][j] << COL - j - 1;
            }
        }

        return totalScore;
    }
}
