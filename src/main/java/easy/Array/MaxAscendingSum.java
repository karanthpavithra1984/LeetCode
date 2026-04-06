package easy.Array;

public class MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int currentSum = nums[0], maxSum = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum = 0;
                ;
            }
            currentSum += nums[i];
        }

        return Math.max(maxSum, currentSum);
    }
}
