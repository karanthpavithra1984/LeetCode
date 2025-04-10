package medium.Matrix;

public class MinFallingPathSumBottomUp2D {
    public int minFallingPathSum(int[][] matrix) {
        //In the bottom up start from the bottom and calculate it.
        //Return the minimum value at the top row .

        //extra row and column, since we start from the bottom
        int[][] dp = new int[matrix.length+1][matrix.length+1];
        for(int row = matrix.length-1; row >= 0; row--){
            for(int col=0; col<matrix.length;col++){
                dp[row][col] = matrix[row][col];
                //Left
                if(col==0){
                    dp[row][col] += Math.min(dp[row+1][col], dp[row+1][col+1]);
                }else if (col == matrix.length-1){//right
                    dp[row][col] += Math.min(dp[row+1][col], dp[row+1][col-1]);
                }else{
                    dp[row][col] += Math.min(dp[row+1][col-1],
                            Math.min(dp[row+1][col], dp[row+1][col+1]));
                }
            }
        }

        //once u have all the dp calculate  , lets get the minimum of first row;
        int minimumValue = Integer.MAX_VALUE;
        for(int col= 0 ;col < matrix.length; col++){
            minimumValue = Math.min(minimumValue, dp[0][col]);
        }

        return minimumValue;
    }


}
