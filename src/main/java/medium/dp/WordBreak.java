package medium.dp;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true; //Last value , if it has reached then its true.

        for (int i = s.length() - 1; i >= 0; i--) {
            for (String word : wordDict) {
                if (i + word.length() <= s.length() && s.startsWith(word, i)) {
                    dp[i] = dp[i + word.length()];
                }

                if (dp[i])
                    break;
            }
        }

        return dp[0];
    }
}
