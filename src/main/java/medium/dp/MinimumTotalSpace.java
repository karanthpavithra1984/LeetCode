package medium.dp;

import java.util.List;

public class MinimumTotalSpace {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] nextRow = new int[triangle.size() + 1];

        for(int level = triangle.size()-1;level>=0;level--){
            int[] currRow = new int[triangle.size() + 1];
            for(int col = 0; col < level; col++){
                currRow[col] = triangle.get(level).get(col) + Math.min(nextRow[col], nextRow[col+1]);
            }

            nextRow = currRow;
        }

        return nextRow[0];
    }
}
