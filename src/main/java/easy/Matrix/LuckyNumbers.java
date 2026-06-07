package easy.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        //There can be only one lucky Number.
        //Find maximum of minimum number in all the rows

        int ROW = matrix.length, COL = matrix[0].length;

        int rowMinMax = Integer.MIN_VALUE;
        for (int i = 0; i < ROW; i++) {
            int rMin = Integer.MAX_VALUE;
            for (int j = 0; j < COL; j++) {
                rMin = Math.min(rMin, matrix[i][j]);
            }
            rowMinMax = Math.max(rowMinMax, rMin);
        }

        //Find the minimum of maximum values of all the cols
        int colMinMax = Integer.MAX_VALUE;
        for (int i = 0; i < COL; i++) {
            int colMax = Integer.MIN_VALUE;
            for (int j = 0; j < ROW; j++) {
                colMax = Math.max(colMax, matrix[j][i]);
            }
            colMinMax = Math.min(colMax, colMinMax);
        }

        if (colMinMax == rowMinMax) {
            return new ArrayList<>(Arrays.asList(colMinMax));
        }

        return new ArrayList<>();
    }
}
