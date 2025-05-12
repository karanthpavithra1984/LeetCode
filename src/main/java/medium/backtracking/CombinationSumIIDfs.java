package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIIDfs {
    /**
     * O(N*2^n) + nlogn
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //nlogn
        Arrays.sort(candidates);//Sort them first
        List<List<Integer>> res = new LinkedList<>();//Use set here

        backtrack(candidates, target, res, 0, new ArrayList<>());
        return new ArrayList<>(res);
    }

    /**
     * n*2^n
     *
     * @param candidates
     * @param remaining
     * @param res
     * @param i
     * @param combination
     */
    private void backtrack(int[] candidates, int remaining, List<List<Integer>> res, int i, List<Integer> combination) {

        if (remaining == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }

        if (remaining < 0 || i >= candidates.length)
            return;


        combination.add(candidates[i]);
        backtrack(candidates, remaining - candidates[i], res, i + 1, combination);
        combination.remove(combination.size() - 1);
        backtrack(candidates, remaining, res, i + 1, combination);
    }


}
