package easy.Set;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        //Time Complexity o(n)
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                break;
            }
            sum += nums[i];
        }

        //another o(n) for looping
        //But set add is o(1)
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        //We are just looping through until we found something
        //worst case the element greater would be at the last
        while (true) {
            if (!set.contains(sum)) {
                return sum;
            }
            //Keep on looking
            sum++;
        }
    }
}
