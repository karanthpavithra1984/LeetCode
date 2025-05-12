package medium.slidingWindow;

public class SubArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int product = 1;
        int left = 0;
        int right = 0;
        int result = 0;


        while (left <= right && right < nums.length) {
            product *= nums[right];

            while (product >= k && left < nums.length) {
                product = product / nums[left];
                left++;
            }

            result += right - left + 1;
            right++;
        }
        return result < 0 ? 0 : result;
    }
}
