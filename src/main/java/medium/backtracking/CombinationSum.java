package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    int globalTarget = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        globalTarget = target;
        Arrays.sort(candidates);
        int total = 0;

        List<Integer> combination = new ArrayList<>();
        dfs(candidates, total, 0,res,combination);

        return res;
    }

    private void dfs(int[] nums, int total, int i, List<List<Integer>> res, List<Integer> combination) {
        if (total == globalTarget) {
            res.add(new ArrayList<>(combination));
            return;
        }
        combination.add(nums[i]);
        dfs(nums, total + nums[i], i , res, combination);
        combination.remove(combination.size() - 1);
        dfs(nums, total + nums[i], i+1 , res, combination);
    }
}
