package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIteration {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        List<Integer> comb = new ArrayList<>();
        dfs(candidates, target, 0, comb, result,0);
        return result;
    }


    private void dfs(int[] candidates, int target, int i, List<Integer> comb, List<List<Integer>> result, int total){
        if(total == target){
            result.add(new ArrayList<>(comb));
            return;
        }

        for(int j= i; j< candidates.length; j++){
            if(total + candidates[i] > target)
                return;
            comb.add(candidates[j]);
            dfs(candidates, target, j, comb, result, total + candidates[j]);
            comb.remove(comb.size()-1);
        }
    }

}
