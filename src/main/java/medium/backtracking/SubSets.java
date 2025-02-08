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
        dfs(nums, 0, res, subset);
        return res;
    }

    private void dfs(int[] nums, int i, List<List<Integer>> res, List<Integer> subset){
        if(i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums, i + 1, res, subset);
        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, res, subset);
    }

}
