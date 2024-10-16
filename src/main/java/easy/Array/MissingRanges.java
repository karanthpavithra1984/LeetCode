package easy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TimeComplexity o(n)
 * Space is missingRanges
 */

public class MissingRanges {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> missingRanges = new ArrayList<>();

        //when nums is empty
        if(nums.length == 0){
            missingRanges.add(Arrays.asList(lower, upper));
            return missingRanges;
        }

        //when nums.length is 1

        if(nums[0] > lower){
            missingRanges.add(Arrays.asList(lower, nums[0]-1));
        }



        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1 ) {
                missingRanges.add(Arrays.asList(nums[i] + 1, nums[i + 1] - 1));
            }
        }

        if(nums[nums.length-1] < upper){
            missingRanges.add(Arrays.asList(nums[nums.length-1] + 1, upper));
        }

        return missingRanges;
    }

}
