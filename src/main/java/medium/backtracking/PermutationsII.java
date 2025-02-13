package medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    /**
     * Time Complexity o(nlogn + n!n)
     * Space Complexity o(n!n + some n for boolean, array list etc)
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permuations = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        //Time Complexity o(nlogn)
        Arrays.sort(nums);

        backtrack(permuations, nums, new ArrayList<>(), used);
        return permuations;
    }

    private void backtrack(List<List<Integer>> permuations,
                           int[] nums, List<Integer> permutation, boolean[] used) {
        if (permutation.size() == nums.length) {
            //Complexity o(n)
            permuations.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            //o(!n)
            //Since the values have to be unique , we cant reuse the used ones.
            if(used[i]) continue;
            //If two values are same (array is sorted) , make sure the previous one is not used.
            //Then continue , since the permutation is already created
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            backtrack(permuations, nums, permutation, used);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }
    }
}
