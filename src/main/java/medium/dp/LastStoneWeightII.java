package medium.dp;

public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
        int stoneSum = 0;
        for (int stone : stones) {
            stoneSum += stone;
        }
        int target = stoneSum / 2;
        int[] dp = new int[target+1];

        for(int stone: stones){
            for(int t= target; t>=stone; t--){
                dp[t] = Math.max(dp[t],dp[t-stone] + stone );
            }
        }

        return Math.abs(dp[target] - (stoneSum - dp[target]));
    }
}
