package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is similar to subsets except the array is not unique
 * And you cant have duplicate subsets.
 *
 * [1,2,2,3] -
 * [],[1],[1,2],[1,2,2],[1,2,2,3]
 * Note with two 2's its possible to have [1,2] & [1,2] twice.
 * So the trick is to use Set
 */

public class SubSetsIIIteration {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        backtrack(nums, result, 0, new ArrayList<>());

        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, int index, List<Integer> comb) {

        result.add(new ArrayList<>(comb));

        for (int j = index; j < nums.length; j++) {
            if (j > index && nums[j] == nums[j - 1]) {
                continue;
            }
            comb.add(nums[j]);
            backtrack(nums, result, j + 1, comb);
            comb.remove(comb.size() - 1);
        }
    }


}
