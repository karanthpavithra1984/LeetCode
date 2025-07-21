package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int[] returnArray = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    returnArray[0] = i;
                }
            } else {
                returnArray[1] = i;
            }
        }

        return returnArray;
    }
}
