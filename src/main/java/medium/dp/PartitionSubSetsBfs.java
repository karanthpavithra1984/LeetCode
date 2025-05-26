package medium.dp;

public class PartitionSubSetsBfs {
    public boolean canPartition(int[] nums) {
        long sum = 0;
        for(int num: nums){
            sum += num;
        }

        if(sum % 2 != 0){
            return false; //If you cant partition into two , then its false
        }

        int target = (int) (sum/2);
        int N = nums.length;


        //Number of elements in the array
        boolean[][] dp = new boolean[N+1][target+1];

        for(int i=0; i <= N; i++){
            dp[i][0] = true; //
        }

        for(int i=1; i <= N; i++){
            int curr = nums[i-1];
            for(int j=1; j <= target; j++){
                if(j < curr){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] =  dp[i-1][j] || dp[i-1][j- curr];
                }
            }
        }

        return dp[N][target];
    }


}
