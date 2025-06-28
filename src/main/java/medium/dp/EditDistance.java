package medium.dp;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        //We are doing bottom up two dimensional dp

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        //Initialize the last row and column
        //Last column , where word2 is empty
        for (int i = 0; i <= word1.length(); i++) {
            dp[i][word2.length()] = word1.length() - i;
        }

        //Last row, where word1 is empty
        for (int j = 0; j <= word2.length(); j++) {
            dp[word1.length()][j] = word2.length() - j;
        }

        for (int i = word1.length() - 1; i >= 0; i--) {
            for (int j = word2.length() - 1; j >= 0; j--) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    //If the characters are same, then no operation is needed
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    //If the characters are different, we can either insert, delete or replace
                    dp[i][j] = Math.min(dp[i + 1][j], Math.min(dp[i][j + 1], dp[i + 1][j + 1])) + 1;
                }
            }
        }

        return dp[0][0];
    }
}
