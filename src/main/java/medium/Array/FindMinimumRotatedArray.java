package medium.Array;

public class FindMinimumRotatedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;

        //If the last element is greater than first element its not rotated
        if (nums[right] > nums[left]) return nums[left];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];

            if (nums[mid] < nums[mid - 1]) return nums[mid];

            if (nums[mid] > nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;

    }
}
