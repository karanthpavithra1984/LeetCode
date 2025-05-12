package medium.hashTable;

import java.util.HashSet;
import java.util.Set;

public class CheckValid {
    public boolean checkValid(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < ROW; i++) {
            row.clear();
            col.clear();
            for (int j = 0; j < COL; j++) {
                row.add(matrix[i][j]);
                col.add(matrix[j][i]);
            }

            if (row.size() != ROW || col.size() != COL) {
                return false;
            }
        }

        return true;
    }
}
