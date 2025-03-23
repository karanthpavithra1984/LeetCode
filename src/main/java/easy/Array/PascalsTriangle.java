package easy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time Complexity - o(n)
 * Space complexity o(n) - pascalsTriangle
 */

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        pascalsTriangle.add(Arrays.asList(1));

        for(int i= 1; i < numRows; i++){
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            List<Integer> previousRow = pascalsTriangle.get(i-1);

            for(int j= 1; j < i; j++){
                currentRow.add(previousRow.get(j) + previousRow.get(j-1));
            }

            currentRow.add(1);

            pascalsTriangle.add(currentRow);
        }

        return pascalsTriangle;
    }
}
