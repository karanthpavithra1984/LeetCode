package medium.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCountMap = new HashMap<>();
        prefixCountMap.put(0, 1);

        int sum = 0;
        int totalCount = 0;
        for (int num : nums) {
            sum += num;
            int prefixSum = sum - k;
            if (prefixCountMap.containsKey(prefixSum)) {
                totalCount += prefixCountMap.get(prefixSum);
            }

            prefixCountMap.put(sum, prefixCountMap.getOrDefault(sum, 0) + 1);
        }

        return totalCount;
    }
}
