package medium.Matrix;

public class MaxMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        // Get the total sum by summing absolute value.
        // If the value is negative , count it
        //Also get the minimum absolute value.

        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;
        long totalSum = 0;
        for(int i= 0 ; i < matrix.length ; i++){
            for(int j= 0; j< matrix[0].length ; j++){
                if(matrix[i][j] < 0){
                    negativeCount++;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(matrix[i][j]));
                totalSum += Math.abs(matrix[i][j]);
            }
        }

        //If negative Count is odd, then there will be one item which cant be flipped, so we need to substract twice
        //One for the gain , it would have cuased if it could be flipped and the other negative value it self.
        if(negativeCount % 2 != 0){
            totalSum -= 2*minAbsValue;
        }

        return totalSum;
    }
}
