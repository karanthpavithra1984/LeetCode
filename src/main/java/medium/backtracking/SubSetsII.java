package medium.backtracking;

import java.util.*;

/**
 * This is similar to subsets except the array is not unique
 * And you cant have duplicate subsets.
 * <p>
 * [1,2,2,3] -
 * [],[1],[1,2],[1,2,2],[1,2,2,3]
 * Note with two 2's its possible to have [1,2] & [1,2] twice.
 * So the trick is to use Set
 */

public class SubSetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); //Sort them so that it becomes easier to navigate through them
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        dfs(nums, 0, res, combination);
        return new ArrayList<>(res);
    }

    private void dfs(int[] nums, int index, List<List<Integer>> res, List<Integer> combination) {
        if (index == nums.length) {
            res.add(new ArrayList<>(combination));
            return;
        }

        combination.add(nums[index]);
        dfs(nums, index + 1, res, combination);
        combination.remove(combination.size() - 1);

        while (index + 1 < nums.length && nums[index] == nums[index + 1])
            index++;
        dfs(nums, index + 1, res, combination);
    }
}
