package medium.dp;

public class MaximumProfit {
    public int maximumProfit(int[] present, int[] future, int budget) {
        int[] dp = new int[budget+1];

        for(int i=0;i< present.length; i++){
            for(int b=budget; b>= present[i]; b--){
                //calculate the value for each budget
                dp[b]= Math.max(dp[b] , dp[b-present[i]] + future[i]-present[i]);
            }
        }

        return dp[budget];
    }
}
