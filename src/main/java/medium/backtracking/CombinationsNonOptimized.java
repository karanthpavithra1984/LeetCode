package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationsNonOptimized {
    private int counter;

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(n, 1, k, res, combination);
        return res;
    }

    private void backtrack(int n, int index, int k, List<List<Integer>> res, List<Integer> combination) {
        if (combination.size() == k) {
            res.add(new ArrayList<>(combination));
            return;
        }

        if (index > n) {
            return;
        }

        counter++;
        combination.add(index);
        backtrack(n, index + 1, k, res, combination);
        combination.remove(combination.size() - 1);
        backtrack(n, index + 1, k, res, combination);
    }

}
