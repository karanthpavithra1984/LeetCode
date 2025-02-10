package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);//Sort them first
        List<List<Integer>> res = new ArrayList<>();

        backtrack(candidates, target, target,res, 0, new ArrayList<>() );
        return res;
    }

    private void backtrack(int[] candidates, int remaining, int target, List<List<Integer>> res, int idx, List<Integer> combination) {

        if(remaining == 0){
            res.add(new ArrayList<>(combination));
            return;
        }

        if(remaining < 0 || idx > candidates.length)
            return;

        for(int i=idx; i<candidates.length && candidates[i] <= remaining; i++){
            combination.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], target, res, i+1, combination);
            combination.remove(combination.size()-1);
        }

    }
}
