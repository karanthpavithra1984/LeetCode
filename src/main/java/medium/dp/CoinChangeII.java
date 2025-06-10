package medium.dp;

public class CoinChangeII {
    public int change(int amount, int[] coins) {
        long[] dp = new long[amount + 1];
        dp[0] = 1;

        //Go through the coins
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return (int) dp[amount];
    }
}
