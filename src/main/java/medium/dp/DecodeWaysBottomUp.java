package medium.dp;

public class DecodeWaysBottomUp {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;

        //Start with last value
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                dp[i] = 0; //if its 0 , then it wont be calcualted
            } else {
                dp[i] = dp[i + 1];
                if (i + 1 < s.length() && (s.charAt(i) == '1' || (
                        s.charAt(i) == '2' && s.charAt(i + 1) < '7'
                ))) {
                    dp[i] += dp[i + 2];
                }
            }
        }

        return dp[0];
    }
}
