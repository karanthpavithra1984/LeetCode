package hard.dp;

public class PaintHouseII {
    public int minCostII(int[][] costs) {
        int k = costs[0].length;
        int n = costs.length;
        int[] dp = new int[k];
        //Fill up with first row with the first cost
        for (int i = 0; i < k; i++) {
            dp[i] = costs[0][i];
        }

        for (int i = 1; i < n; i++) {
            int minColor = Integer.MAX_VALUE, secondMinColor = Integer.MAX_VALUE;
            //Find the first minimum and second Minimum
            for (int j = 0; j < k; j++) {
                if (minColor > dp[j]) {
                    secondMinColor = minColor;
                    minColor = dp[j];
                } else if (secondMinColor > dp[j]) {
                    secondMinColor = dp[j];
                }
            }

            //Now use the secondMinimum , if the current house is the minimumColor from previousDp
            //Or else use the firstMinimum.
            for (int j = 0; j < k; j++) {
                if (dp[j] == minColor) {
                    dp[j] = costs[i][j] + secondMinColor;
                } else {
                    dp[j] = costs[i][j] + minColor;
                }
            }
        }

        int minColor = Integer.MAX_VALUE;

        for (int i = 0; i < dp.length; i++) {
            minColor = Math.min(dp[i], minColor);
        }

        return minColor;
    }
}
