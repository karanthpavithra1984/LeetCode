package medium.dp;

public class EditDistanceSpaceOptimized {
    public int minDistance(String word1, String word2) {
        //We are doing bottom up one dimensional dp

        //We only need the current and previous row to calculate the edit distance
        int[] dp = new int[word2.length() + 1];

        //Initialize the last row

        //Last row, where word1 is empty
        for (int j = 0; j <= word2.length(); j++) {
            dp[j] = word2.length() - j;
        }

        for (int i = word1.length() - 1; i >= 0; i--) {
            int[] currentDp = new int[word2.length() + 1];
            currentDp[word2.length()] = word1.length() - i; // Last column, where word2 is empty
            for (int j = word2.length() - 1; j >= 0; j--) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    //If the characters are same, then no operation is needed
                    currentDp[j] = dp[j + 1];
                } else {
                    //If the characters are different, we can either insert, delete or replace
                    currentDp[j] = Math.min(dp[j], Math.min(currentDp[j+1], dp[j + 1])) + 1;
                }
            }
            dp = currentDp; // Move to the next row
        }

        return dp[0];
    }
}
