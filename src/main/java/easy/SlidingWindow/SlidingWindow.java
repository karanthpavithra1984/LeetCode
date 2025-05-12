package easy.SlidingWindow;

/**
 * Time Complexity o(n)
 * Space o(1)
 */
public class SlidingWindow {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) {
                sum -= nums[i - k];
                maxSum = Math.max(maxSum, sum);
            } else {
                maxSum = sum;
            }
        }

        if (nums.length == k) {
            return sum / k;
        }


        return maxSum / k;
    }
}
