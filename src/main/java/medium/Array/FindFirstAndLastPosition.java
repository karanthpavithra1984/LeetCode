package medium.Array;

/**
 * Time Complexity - o(logn)
 * Space Complexity - o(1)
 */

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {

        int begin = findTarget(nums, target, true);

        //No first occurance
        if (begin == -1) {
            return new int[]{-1, -1};
        }

        int end = findTarget(nums, target, false);

        return new int[]{begin, end};

    }

    private int findTarget(int[] nums, int target, boolean forLower) {
        int endIndex = nums.length - 1;
        int startIndex = 0;

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;

            if (target == nums[mid]) {
                if (forLower) {
                    if (mid == startIndex || nums[mid - 1] != target)
                        return mid;

                    endIndex = mid - 1;

                } else {
                    if (mid == endIndex || nums[mid + 1] != target)
                        return mid;

                    startIndex = mid + 1;


                }
            } else if (target < nums[mid]) {
                endIndex = mid - 1;
            } else if (target > nums[mid]) {
                startIndex = mid + 1;
            }
        }

        return -1;
    }
}
