package medium.slidingWindow;

public class MaxConsecutiveOnesIII {
    /**
     * time - o(n)
     * space complexity o(1)
     *
     * @param nums
     * @param k
     * @return
     */
    public int longestOnes(int[] nums, int k) {
        int zeroCounter = 0;
        int max = 0;
        int leftIndex = 0, rightIndex = 0;

        while (rightIndex < nums.length) {
            if (nums[rightIndex] == 0) {
                zeroCounter++;
            }

            while (zeroCounter > k) {
                if (nums[leftIndex] == 0) {
                    zeroCounter--;
                }
                leftIndex++;
            }

            max = Math.max(max, rightIndex - leftIndex + 1);
            rightIndex++;
        }

        return max;
    }
}
