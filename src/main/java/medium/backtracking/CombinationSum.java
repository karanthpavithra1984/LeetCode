package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time complexity o(2^t/m)
 * Space complexity o(2^t/m)
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        List<Integer> combination = new ArrayList<>();
        dfs(candidates, target, 0,res,combination);

        return res;
    }

    private void dfs(int[] nums, int target, int i, List<List<Integer>> res, List<Integer> combination) {
        if (target == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }
        if(target < 0 || i >= nums.length) return;

        combination.add(nums[i]);
        dfs(nums, target - nums[i], i , res, combination);
        combination.remove(combination.size() - 1);
        dfs(nums, target, i+1 , res, combination);
    }
}
