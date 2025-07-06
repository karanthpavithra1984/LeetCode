package hard.dp;

public class BurstBalloons {
    public int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length + 2];
        newNums[0] = 1;
        newNums[newNums.length - 1] = 1;

        System.arraycopy(nums, 0, newNums, 1, newNums.length - 1 - 1);

        Integer[][] dp = new Integer[newNums.length][newNums.length];

        return burstBalloons(newNums, 1, newNums.length - 2, dp);
    }

    private int burstBalloons(int[] newNums, int left, int right, Integer[][] dp) {
        if (left > right) {
            return 0;
        }

        if (dp[left][right] != null) {
            return dp[left][right];
        }

        dp[left][right] = 0; // Initialize the dp value for this subproblem

        for (int i = left; i <= right; i++) {
            //Formula mentioned in the problem. What if the number is the last element to be popped.
            int coins = newNums[left - 1] * newNums[i] * newNums[right + 1];
            //Recursively call the function for the left and right subarrays
            coins += burstBalloons(newNums, left, i - 1, dp);
            coins += burstBalloons(newNums, i + 1, right, dp);
            dp[left][right] = Math.max(dp[left][right], coins);
        }

        return  dp[left][right];
    }
}
