package easy.Matrix;

public class TeoplitzMatrix {
    /**
     * o(n*m)
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i= 0 ; i < matrix.length-1; i++){
            for(int j = 0 ; j < matrix[i].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }

        return true;

        //What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?
        /**
         * Get every row i.e previousRow = currentRow
         * and compare previosuRow with the currentRow
         */


        //What if the matrix is so large that you can only load up a partial row into the memory at once?
        /**
         * same as above only load half of the currentRow
         * and then do the same thing as above
         */
    }
}
