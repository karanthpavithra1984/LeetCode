package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    /**
     * Time Complexity o(k* !n/!k * !n-k) = o(k, c(n,k)) - c(n,k) -> Combination
     * Space Complexity o(k) - combination excluding the result
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(n, 1, k, res, combination);
        return res;
    }

    private void backtrack(int n, int index, int k, List<List<Integer>> res, List<Integer> combination) {
        if(combination.size() == k) {
            res.add(new ArrayList<>(combination));
            return;
        }

        if(index > n) {
            return;
        }

        for(int i = index; i < n+1; i++) {
            combination.add(i);
            backtrack(n, i + 1, k, res, combination);
            combination.remove(combination.size()-1);
        }
    }

}
