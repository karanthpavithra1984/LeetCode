package medium.dp;

public class PartitionSubSetsBfsOptimal {
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
        //You just need the previous value
        boolean[] dp = new boolean[target+1];
        dp[0] = true; //0 is always possible


        for(int i=0; i < N; i++){
            for(int j=target ; j>=nums[i];j--){
               dp[j] = dp[j] || dp[j-nums[i]];
            }
        }

        return dp[target];
    }


}
