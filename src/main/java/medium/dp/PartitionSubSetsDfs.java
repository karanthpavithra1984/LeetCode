package medium.dp;

public class PartitionSubSetsDfs {
    public boolean canPartition(int[] nums) {
        long sum = 0;
        for(int num: nums){
            sum += num;
        }

        if(sum % 2 != 0){
            return false; //If you cant partition into two , then its false
        }

        int target = (int) (sum/2);


        Boolean[][] dp = new Boolean[nums.length+1][target+1];

        return dfs(dp, nums, 0, target);
    }


    private boolean dfs(Boolean[][] dp, int[] nums, int i, int target){
        if(i == nums.length){
            return target == 0; //Target should be 0;
        }

        if(target <0)
            return false;

        if(dp[i][target] != null){
            return dp[i][target];
        }

        return dp[i][target] = dfs(dp,nums, i+1, target) || dfs(dp, nums, i+1, target-nums[i]);
    }

}
