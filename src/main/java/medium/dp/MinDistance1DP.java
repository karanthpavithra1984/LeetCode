package medium.dp;

public class MinDistance1DP {
    public int minDistance(String word1, String word2) {
        int[] dp = new int[word2.length() + 1];
        //Bottom up dp
        for(int i = 1; i <= word1.length(); i++) {
            int[] currentDp = new int[word2.length() + 1];
            for(int j = 1; j <= word2.length(); j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    //If equal add 1
                    currentDp[j] = dp[j - 1] + 1;
                }else {
                    currentDp[j] = Math.max(dp[j], currentDp[j-1]);
                }
            }
            dp = currentDp;
        }

        //Last DP is the number of deletions

        return word1.length() + word2.length() - 2*dp[word2.length()];
    }
}
