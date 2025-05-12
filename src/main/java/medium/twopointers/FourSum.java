package medium.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length < 4) return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            //First loop
            //Avoid duplicates
            if (i == 0 || nums[i] != nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j == i + 1 || nums[j] != nums[j - 1]) continue;

                twoSum(nums, target, i, j, res);
            }
        }

        return res;
    }


    private void twoSum(int[] nums, int target, int firstIndex, int secondIndex, List<List<Integer>> result) {
        int left = secondIndex + 1;
        int right = nums.length - 1;

        while (left < right) {
            long sum = nums[left] + nums[right] + nums[firstIndex] + nums[secondIndex];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                result.add(Arrays.asList(nums[firstIndex], nums[secondIndex], nums[left++], nums[right--]));

                //Similar to the first method, avoid duplciates;

                while (left < right && nums[left] == nums[left - 1]) left++;

                while (left < right && nums[right] == nums[right + 1]) right--;
            }
        }
    }
}
