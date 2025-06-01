package medium.dp;

public class ZeroesAndOnesDp {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            int[] count = countZerosAndOnes(str);

            for (int zeros = m; zeros >= count[0]; zeros--) {
                for (int ones = n; ones >= count[1]; ones--) {
                    dp[zeros][ones] = Math.max(dp[zeros][ones],
                            1 + dp[zeros - count[0]][ones - count[1]]);
                }
            }
        }

        return dp[m][n];
    }

    private int[] countZerosAndOnes(String str) {
        int[] count = new int[2];

        for (Character character : str.toCharArray()) {
            if (character == '0') {
                count[0]++;
            } else {
                count[1]++;
            }
        }
        return count;
    }
}
