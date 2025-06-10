package medium.dp;

public class InterLeavingStringTD {
    Boolean[][] dp;

    public boolean isInterleave(String s1, String s2, String s3) {
        dp = new Boolean[s1.length() + 1][s2.length() + 1];
        return dfs(s1, s2, s3, 0, 0, 0);
    }

    private boolean dfs(String s1, String s2, String s3, int s1Index, int s2Index, int s3Index) {
        //Reached the end of the strings
        if (s3Index == s3.length() &&
                s1.length() == s1Index && s2.length() == s2Index) {
            return true;
        }

        if (dp[s1Index][s2Index] != null) {
            return dp[s1Index][s2Index];
        }

        boolean res = false;
        if (s1Index < s1.length() && s3Index < s3.length() && s1.charAt(s1Index) == s3.charAt(s3Index)) {
            //If it matches the character, increment the s1Index;
            res = dfs(s1, s2, s3, s1Index + 1, s2Index, s3Index + 1);
        }

        //Case it doesnt matcht, go to the s2
        if (!res && s2Index < s2.length() && s3Index < s3.length() && s2.charAt(s2Index) == s3.charAt(s3Index)) {
            res = dfs(s1, s2, s3, s1Index, s2Index + 1, s3Index + 1);
        }

        return dp[s1Index][s2Index] = res;
    }
}
