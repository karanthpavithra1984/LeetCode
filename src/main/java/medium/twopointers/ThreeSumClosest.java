package medium.twopointers;

import java.util.Arrays;

/**
 * Time Complexity o(nlogn)
 * Space complexity o(1) if we exclude output result
 */

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int minDistance = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];

               if(Math.abs(sum - target) < Math.abs(minDistance)) {
                   minDistance = target - sum;
               }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        //This is sum we could save the sum or return like this.
        return target - minDistance;
    }
}
