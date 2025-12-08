package easy.hashTable;

import java.util.HashMap;
import java.util.Map;


public class LargestInteger {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = -1;

        for (int key : map.keySet()) {
            if (key > max && map.get(key) == 1 ) {
                max = key;
            }
        }

        return max;
    }
}
