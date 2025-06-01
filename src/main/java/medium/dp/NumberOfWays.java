package medium.dp;

public class NumberOfWays {
    Integer[][] dp ;
    final int MOD = (int) (Math.pow(10,9) + 7);
    public int numberOfWays(int n, int x) {
        dp = new Integer[301][301];
        return backTrack(n, 1, x);
    }

    private int backTrack(int target, int num, int power ){
        if(target == 0){
            return 1;
        }
        int temp = (int) Math.pow(num, power);
        if(temp > target){
            return 0;
        }

        if(dp[num][target] != null){
            return dp[num][target];
        }

        return dp[num][target] =
                (backTrack(target - temp, num+1, power) % MOD+
                backTrack(target , num+1, power) % MOD)%MOD;
    }
}
