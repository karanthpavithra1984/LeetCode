package medium.dp;

public class NumberOfWaysCoin {
    public int numberOfWays(int n) {
        final int MOD = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;

        //Very smart - Since we can only use 1 coin for 4 and 1 for 8
        if(n >= 4) dp[4] = 1;
        if(n >= 8) dp[8] = 1;

        int[] coins = new int[]{1,2,6};

        //Go through the coins
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= n; j++) {
                dp[j] += dp[j - coins[i]];
                dp[j] %= MOD;
            }
        }

        return dp[n];
    }
}
