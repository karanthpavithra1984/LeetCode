package medium.twopointers;

public class NextPermutation {

    /**
     * Time Complexity o(n)
     * @param nums
     */

    public void nextPermutation(int[] nums) {
        int end = nums.length - 2;

        while (end >= 0 && nums[end] >= nums[end + 1]) {
            end--;
        }

        int nextGreater = nums.length - 1;
        if (end >= 0) {
            while (nums[nextGreater] <= nums[end]) {
                nextGreater--;
            }

            swap(nums, end, nextGreater);
        }
        int last = nums.length - 1;
        end = end + 1;
        while (end < last) {
            swap(nums, end, last);
            end++;
            last--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
