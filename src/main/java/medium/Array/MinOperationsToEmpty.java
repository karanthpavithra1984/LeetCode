package medium.Array;

import java.util.HashMap;
import java.util.Map;

public class MinOperationsToEmpty {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> countNumbers = new HashMap<>();

        for (int i : nums) {
            countNumbers.put(i, countNumbers.getOrDefault(i, 0) + 1);
        }

        int ans = 0;

        for (int key : countNumbers.keySet()) {
            if (countNumbers.get(key) == 1) {
                return -1;
            }

            ans += (int) Math.ceil((double) countNumbers.get(key) / 3);
        }

        return ans;
    }
}
