package medium.dp;

import java.util.Arrays;

public class LastStoneWeightIIRecursive {
    public int lastStoneWeightII(int[] stones) {
        int total = Arrays.stream(stones).sum();
        //The out put is basically splitting the stones into two based on the totalSum.
        //And then split them up into half. The difference of both is the minStone.
        int target = (int) Math.ceil(total / 2);
        Integer[][] dp = new Integer[stones.length + 1][target + 1];

        return dfs(stones, 0, target, total, 0, dp);
    }

    private int dfs(int[] stones, int index, int target, int total, int currentSum, Integer[][] dp) {
        if (index == stones.length || currentSum >= target) {
            //That is we found the half of the piles.
            //If the sum is 23, and the currentSum is 12, then the piles are 12 and 11
            //The difference between them is 1 i.e 12 - (23 -12)
            return Math.abs(currentSum - (total - currentSum));
        }

        if (dp[index][currentSum] != null) {
            return dp[index][currentSum];
        }

        //Include the current index and not include the current index
        return dp[index][currentSum] = Math.min(dfs(stones, index + 1, target, total, currentSum, dp),
                dfs(stones, index + 1, target, total, currentSum + stones[index], dp));
    }
}
