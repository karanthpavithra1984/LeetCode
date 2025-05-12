package easy.dp;

public class Tribonacci {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int[] dp = new int[]{0, 1, 1};

        for (int i = 3; i <= n; i++) {
            int tmp1 = dp[1];
            int tmp2 = dp[2];
            dp[2] = dp[0] + dp[1] + dp[2];
            dp[0] = tmp1;
            dp[1] = tmp2;
        }

        return dp[2];
    }
}
