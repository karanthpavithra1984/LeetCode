package easy.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Time Complexity - o(n)
 * Space complexity - o(1)
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> hasSet = new HashSet<>();
        for (int num : nums) {
            hasSet.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!hasSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
