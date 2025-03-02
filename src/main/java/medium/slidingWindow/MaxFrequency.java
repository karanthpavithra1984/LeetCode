package medium.slidingWindow;

import java.util.Arrays;

/**
 * Time complexity o(nlogn)
 * Space complexity o(1)
 */

public class MaxFrequency {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int right = 0;
        int left = 0;
        long total = 0;
        int maxLength = 0;

        while (left <= right && right < nums.length) {
            //This could be long
            long target = nums[right];
            total += target;
            /**
             * [1,1,2,2,4] , k =2
             * l    r
             *
             * total = 4
             * nums[right] = 2
             * right - left + 1 = 3
             *  3* 2 <= 4*2 , we can increment both the 1's
             *  and hit the budget and not go overboard
             *  if the left hand side i.e 3*2 is greater than left , then we have overused the budget
             *  and we need to shift to left
             */

            while (target * (right - left + 1) > total + k) {
                total -= nums[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
