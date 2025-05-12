package easy.Array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer[]> numMap = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (!numMap.containsKey(nums[i])) {
                numMap.put(nums[i], new Integer[]{1, i, null});
            } else {
                Integer[] values = numMap.get(nums[i]);
                values[0] += 1;
                values[2] = i;
            }
        }

        Integer[] values = Collections.max(numMap.values(), Comparator.comparingInt(obj -> obj[0]));

        int minimumSubArray = Integer.MAX_VALUE;
        for (Integer[] val : numMap.values()) {
            if (val[0] == values[0] && val[2] != null) {
                minimumSubArray = Math.min(minimumSubArray, val[2] - val[1] + 1);
            }
        }

        return minimumSubArray == Integer.MAX_VALUE ? 1 : minimumSubArray;
    }
}
