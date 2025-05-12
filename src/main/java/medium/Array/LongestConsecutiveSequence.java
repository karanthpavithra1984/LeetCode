package medium.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int num : nums) {
            values.add(num);
        }

        int maxLength = 0;
        for (int num : nums) {
            if (!values.contains(num - 1)) {
                int length = 1;
                while (values.contains(num + length)) {
                    length++;
                }

                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }
}
