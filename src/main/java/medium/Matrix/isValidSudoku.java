package medium.Matrix;

import java.util.HashSet;
import java.util.Set;

public class isValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int SIZE = 9;
        Set<Integer>[] block = new HashSet[SIZE];
        Set<Integer>[] row = new HashSet[SIZE];
        Set<Integer>[] col = new HashSet[SIZE];
        for (int i = 0; i < block.length; i++) {
            block[i] = new HashSet<>();
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
        }

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                char value = board[r][c];

                if (value == '.') {
                    continue;
                }

                if (!row[r].add(value - '0')) {
                    return false;
                }

                if (!col[c].add(value - '0')) {
                    return false;
                }

                int blockId = (r / 3) * 3 + (c / 3);

                if (!block[blockId].add(value - '0')) {
                    return false;
                }
            }
        }

        return true;
    }
}
