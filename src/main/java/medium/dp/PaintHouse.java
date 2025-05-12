package medium.dp;

public class PaintHouse {
    public int minCost(int[][] costs) {
        //Previous cost
        int[] dp = new int[3];

        for (int i = 0; i < costs.length; i++) {
            //Cost of painting with houses starting with 0 color
            //Min of painting previous houses 1 and 2 , if 0 was choosen
            int dp0 = costs[i][0] + Math.min(dp[1], dp[2]);
            int dp1 = costs[i][1] + Math.min(dp[0], dp[2]);
            int dp2 = costs[i][2] + Math.min(dp[0], dp[1]);
            dp = new int[]{dp0, dp1, dp2};
        }

        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }
}
