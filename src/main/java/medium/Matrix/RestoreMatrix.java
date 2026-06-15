package medium.Matrix;

public class RestoreMatrix {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int ROW = rowSum.length;
        int COL = colSum.length;

        int[][] matrix = new int[ROW][COL];

        int i = 0 ,  j = 0;

        while(i < ROW && j < COL){
            int val = Math.min(rowSum[i], colSum[j]);

            matrix[i][j] = val;

            rowSum[i] -= val;
            colSum[j] -= val;

            if(rowSum[i] == 0){
                i++;
            }else {
                j++; //Default , move next column
            }
        }

        return matrix;
    }
}
