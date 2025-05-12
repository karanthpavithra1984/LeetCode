package medium.dp;

public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];

        int result = minProduct;

        for (int i = 1; i < nums.length; i++) {
            int tempProduct = Math.min(nums[i], Math.min(minProduct * nums[i], maxProduct * nums[i]));
            maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));

            minProduct = tempProduct;

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
