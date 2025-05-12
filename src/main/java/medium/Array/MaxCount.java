package medium.Array;

public class MaxCount {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] nums = new int[n + 1];

        for (int i : banned) {
            if (i < nums.length) {
                nums[i]--;
            }
        }

        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                maxSum -= i;
                if (maxSum < 0) {
                    return counter;
                }
                counter++;
            }
        }

        return counter;
    }
}
