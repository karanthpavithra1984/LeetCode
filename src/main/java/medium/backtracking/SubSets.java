package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
    Time Complexity o(N* 2^n)
    1) If you imagine it as a tree one with the decision and other not,
    then we will have 8 leaf nodes for 3 hence , 2^n
    2) Then you need create a subset and add them to the list -
    So it would o(n)
 *
 */
public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<>();

        dfs(nums, subset, 0, res);
        return res;
    }


    private void dfs(int[] nums, List<Integer> subset, int index, List<List<Integer>> result) {
        if (index >= nums.length) {
            //Make sure u clone
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        dfs(nums, subset, index + 1, result);
        subset.remove(subset.size() - 1);
        dfs(nums, subset, index + 1, result);
    }


}
