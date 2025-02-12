package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n *!n)
 */

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(res, nums, new ArrayList<>());
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, List<Integer> cur) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int n: nums){
            if(!cur.contains(n)) {
                cur.add(n);
                backtrack(res, nums, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
