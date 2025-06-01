package medium.dp;

import java.util.Arrays;

public class NumberOfWaysBottomUp {
    final int MOD = (int) (Math.pow(10, 9) + 7);
    Integer[][] dp;

    public int numberOfWays(int n, int x) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        int tx = 0;


        for (int i = 1; (tx = (int) Math.pow(i, x)) <= n; i++) {
            for (int j = n; j >= tx; j--) {
                dp[j] += dp[j - tx];
                dp[j] %= MOD;
            }
        }

        return dp[n];
    }
}
