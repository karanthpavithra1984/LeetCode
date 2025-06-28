package medium.BinarySearch;

public class SingleNonDuplicates {
    public int singleNonDuplicate(int[] nums) {

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair is valid
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move to the next pair
            } else {
                right = mid; // The single element is in the left half
            }
        }

        return nums[left]; // The single element will be at the left pointer
    }
}
