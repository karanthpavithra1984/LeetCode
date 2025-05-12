package medium.dp;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            //See how many minimum coins u need for each amount from 1 to amount
            for (int j = 0; j < coins.length; j++) {
                //Coins should be less than or equal to amount
                if (coins[j] <= i) {
                    //Get the minimum
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }


        return dp[amount] > amount ? -1 : dp[amount];
    }
}
