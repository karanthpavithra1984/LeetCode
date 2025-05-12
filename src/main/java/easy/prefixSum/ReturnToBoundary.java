package easy.prefixSum;

public class ReturnToBoundary {
    /**
     * Time Complexity - o(n)
     * Space Complexity - o(1)
     *
     * @param nums
     * @return
     */
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            if (sum == 0) {
                count++;
            }
        }

        return count;

    }
}
