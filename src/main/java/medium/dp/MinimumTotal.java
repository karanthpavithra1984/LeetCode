package medium.dp;

import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size() + 1][triangle.size() + 1];

        for(int level = triangle.size() - 1; level >= 0; level--){
            for(int col = 0 ; col < triangle.get(level).size() ; col++){
                dp[level][col] = triangle.get(level).get(col) + Math.min(dp[level+1][col], dp[level+1][col+1]);
            }
        }

        return dp[0][0];
    }
}
