package medium.dp;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += num;

            maxSum =  Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
