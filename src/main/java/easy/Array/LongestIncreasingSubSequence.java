package easy.Array;

public class LongestIncreasingSubSequence {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int start = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] > nums[i - 1]) {
                start++;
                maxLength = Math.max(maxLength, start);
            } else {
                start = 1;
            }
        }

        return maxLength;
    }
}
