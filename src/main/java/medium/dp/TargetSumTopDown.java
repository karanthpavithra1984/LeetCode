package medium.dp;

import java.util.HashMap;
import java.util.Map;

public class TargetSumTopDown {
    Map<String, Integer> dp = new HashMap<>();

    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, target, 0);
    }

    private int backtrack(int[] nums, int index, int target, int currentSum) {
        if (index == nums.length) {
            return target == currentSum ? 1 : 0;
        }

        if (dp.containsKey(index + "-" + currentSum)) {
            return dp.get(index + "-" + currentSum);
        }

        dp.put(index + "-" + currentSum, backtrack(nums, index + 1, target, currentSum + nums[index]) +
                backtrack(nums, index + 1, target, currentSum - nums[index]));

        return dp.get(index + "-" + currentSum);
    }

}
