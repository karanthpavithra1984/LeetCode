package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time complexity o(n^t/m)
 * Space complexity o(t/m)
 * <p>
 * Here we provide a loose upper bound on the number of nodes.
 * <p>
 * First of all, the fan-out of each node would be bounded to N, i.e. the total number of candidates.
 * The maximal depth of the tree, would be T/M , where we keep on adding the smallest element to the combination.
 * So the total complexity is o(N^T/M)
 * .
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> comb = new ArrayList<>();
        dfs(candidates, target, 0, comb, result);
        return result;
    }

    private void dfs(int[] candidates, int target, int i, List<Integer> comb, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(comb));
            return;
        }

        if (target < 0 || i >= candidates.length) {
            return;
        }

        comb.add(candidates[i]);
        dfs(candidates, target - candidates[i], i, comb, result);
        comb.remove(comb.size() - 1);
        dfs(candidates, target, i + 1, comb, result);
    }


}
