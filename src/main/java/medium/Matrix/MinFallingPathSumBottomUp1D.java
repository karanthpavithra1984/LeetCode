package medium.Matrix;

public class MinFallingPathSumBottomUp1D {
    public int minFallingPathSum(int[][] matrix) {
        //In the bottom up start from the bottom and calculate it.
        //Return the minimum value at the top row .

        //extra row and column, since we start from the bottom
        //We only need next row , hence we could get away with single Dimension
        int[] dp = new int[matrix.length+1];
        for(int row = matrix.length-1; row >= 0; row--){
            int[] currentRow = new int[matrix.length+1];
            for(int col=0; col<matrix.length;col++){
                currentRow[col] = matrix[row][col];
                //Left
                if(col==0){
                    currentRow[col] += Math.min(dp[col], dp[col+1]);
                }else if (col == matrix.length-1){//right
                    currentRow[col] += Math.min(dp[col], dp[col-1]);
                }else {
                    currentRow[col] += Math.min(dp[col - 1],
                            Math.min(dp[col], dp[col + 1]));
                }
            }
            dp = currentRow;
        }

        //once u have all the dp calculate  , lets get the minimum of first row;
        int minimumValue = Integer.MAX_VALUE;
        for(int col= 0 ;col < matrix.length; col++){
            minimumValue = Math.min(minimumValue, dp[col]);
        }

        return minimumValue;
    }


}
