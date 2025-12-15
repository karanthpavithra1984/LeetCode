package easy.Array;

import java.util.ArrayList;
import java.util.List;

/*
Time complexity o(n) and space is the same
I am basically releiving the currentRow , sot hat
 */

public class PascalsTriangle2 {
    public List<Integer> getRow(int numRows) {
        if (numRows == 0) {
            return List.of(1);
        }
        List<Integer> previousRow = new ArrayList<>();
        List<Integer> currentRow;

        for (int i = 1; i < numRows + 1; i++) {
            currentRow = new ArrayList<>();

            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }

            currentRow.add(1);

            previousRow = currentRow;

        }

        return previousRow;
    }
}
