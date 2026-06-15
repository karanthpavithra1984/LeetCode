package medium.Matrix;

import java.util.Arrays;

public class LargestSubMatrix {
    public int largestSubmatrix(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;

        int[] prevRow = new int[COL];
        int maxAns = 0;

        for(int r = 0 ;  r< ROW; r++){
            int[] currentRow = matrix[r].clone();
            for(int c=0 ; c< COL; c++){
                if(matrix[r][c] == 1){
                    currentRow[c] += prevRow[c];
                }
            }

            int[] sortedRow = currentRow.clone();
            Arrays.sort(sortedRow); //ascending

            for(int i= 0; i < COL; i++){
                int height  = sortedRow[i];
                int width = COL - i;
                maxAns = Math.max(maxAns , height * width);
            }


            prevRow = currentRow;
        }

        return  maxAns;
    }
}
