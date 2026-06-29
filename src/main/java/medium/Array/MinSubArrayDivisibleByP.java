package medium.Array;

import java.util.HashMap;
import java.util.Map;

public class MinSubArrayDivisibleByP {
    public int minSubarray(int[] nums, int p) {
        //Find the total first and see if its divisble by p
        long total = 0;
        for (int num : nums) {
            total += num;
        }

        int target = (int) (total % p);

        if (target == 0) {
            return target;
        }

        long currentSum = 0;

        Map<Integer, Integer> indexMap = new HashMap<>();

        indexMap.put(0, -1);

        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            int currentSumReminder = (int) (currentSum % p);

            //currentSum - target - could be negative hence, adding with p
            int needed = (currentSumReminder - target + p) % p;

            if (indexMap.containsKey(needed)) {
                minLength = Math.min(minLength, i - indexMap.get(needed));
            }

            indexMap.put(currentSumReminder, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}
