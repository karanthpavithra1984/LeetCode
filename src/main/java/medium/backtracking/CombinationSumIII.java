package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(k * c(9,k)) - combination size can never be greater than k
 * Space complexity o(n)
 */

public class CombinationSumIII {
    final static int N = 9;

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> com = new ArrayList<>();
        backtrack(k, 1, n, res, com);
        return res;
    }

    private void backtrack(int k, int index, int remaining, List<List<Integer>> res, List<Integer> com) {
        if (remaining == 0 && com.size() == k) {
            res.add(new ArrayList<>(com));
            return;
        }

        if (remaining < 0 || com.size() >= k) {
            return;
        }

        int until = N - (k - com.size()) + 1;

        for (int i = index; i <= until; i++) {
            com.add(i);
            backtrack(k, i + 1, remaining - i, res, com);
            com.remove(com.size() - 1);
        }
    }
}
