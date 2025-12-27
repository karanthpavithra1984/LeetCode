package easy.Matrix;

import java.util.ArrayList;
import java.util.List;

public class ModifiedMatrix {
    public int[][] modifiedMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        List<int[]> res = new ArrayList<>();
        int[] colMax = new int[C];
        for(int col = 0; col < C; col++){
            int max = 0;
            for(int row = 0; row < R; row++){
                int value = matrix[row][col];
                if(value < 0){
                    res.add(new int[]{row,col});
                }
                max = Math.max(max, matrix[row][col]);
            }

            colMax[col] = max;
        }

        for(int[] r: res){
            int row = r[0];
            int col = r[1];

            matrix[row][col] = colMax[col];
        }

        return matrix;
    }
}
