package medium.dp;

public class LongestPalindromicSubSequenceTwo {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (s.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[s.length()][1];
    }
}
