package medium.slidingWindow;

public class MaxConsecutiveOnesII {
    /**
     * Time Complexity o(n)
     * Space Complexity o(1)
     * @param nums
     * @return
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int flipIndex = -1;
        int left = -1, right = 0;
        int maxOnes = 0;

        while(right < nums.length) {
            if(nums[right] == 0 ) {
                if(flipIndex >= 0){
                    left = flipIndex;
                }
                flipIndex = right;
            }

            maxOnes = Math.max(maxOnes, right - left );
            right++;
        }

        return maxOnes;
    }
}
