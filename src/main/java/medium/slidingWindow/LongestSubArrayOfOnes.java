package medium.slidingWindow;

public class LongestSubArrayOfOnes {
    //Similar to maxConsecuitveOnes with a twist :)
    public int longestSubarray(int[] nums) {
        int zeroCounter = 0;
        int left = 0, right = 0;
        int max = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCounter++;
            }

            while (zeroCounter > 1) {
                if (nums[left] == 0) {
                    zeroCounter--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        return max - 1; //TWwist since we are deleteing
    }
}
