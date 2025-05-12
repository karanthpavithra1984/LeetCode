package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n *!n)
 */

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, nums, new ArrayList<>());

        return result;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, List<Integer> cur) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int num : nums) {
            if (cur.contains(num)) {
                continue;
            }

            cur.add(num);
            backtrack(res, nums, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
