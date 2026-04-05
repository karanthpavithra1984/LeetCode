package medium.Array;

import java.util.ArrayList;
import java.util.List;

public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        SparseMatrix matrixA = new SparseMatrix(mat1);
        SparseMatrix matrixB = new SparseMatrix(mat2, true);

        int[][] ans = new int[mat1.length][mat2[0].length];

        int row = ans.length;
        int col = ans[0].length;

        for(int i = 0; i < row; i++){
            for(int j=0; j < col; j++){
                int matARowStart = matrixA.rowIndexes.get(i);
                int matARowEnd = matrixA.rowIndexes.get(i+1);

                int matBColStart = matrixB.colIndexes.get(j);
                int matBColEnd = matrixB.colIndexes.get(j+1);

                while(matARowStart < matARowEnd && matBColStart < matBColEnd){
                    if(matrixA.colIndexes.get(matARowStart) < matrixB.rowIndexes.get(matBColStart)){
                        matARowStart++;
                    }else if(matrixA.colIndexes.get(matARowStart) > matrixB.rowIndexes.get(matBColStart)){
                        matBColStart++;
                    }else{
                        ans[i][j] += matrixA.values.get(matARowStart) * matrixB.values.get(matBColStart);
                        matARowStart++;
                        matBColStart++;
                    }
                }
            }
        }

        return ans;
    }

    class SparseMatrix {
        List<Integer> values = new ArrayList<>();
        List<Integer> rowIndexes = new ArrayList<>();
        List<Integer> colIndexes = new ArrayList<>();

        public SparseMatrix(int[][] mat) {
            int row = mat.length;
            int col = mat[0].length;

            rowIndexes.add(0);

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(mat[i][j] != 0){
                        values.add(mat[i][j]);
                        colIndexes.add(j);
                    }
                }

                rowIndexes.add(values.size());
            }
        }

        public SparseMatrix(int[][] mat, boolean colCompress) {
            int row = mat.length;
            int col = mat[0].length;

            colIndexes.add(0);

            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    if(mat[j][i] != 0){
                        values.add(mat[j][i]);
                        rowIndexes.add(j);
                    }
                }

                colIndexes.add(values.size());
            }
        }
    }
}
