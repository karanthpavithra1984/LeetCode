package easy.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> keyValueMap = new HashMap<>();

        for (int num : nums1) {
            keyValueMap.put(num, keyValueMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> values = new ArrayList<>();

        for (int num : nums2) {
            if (keyValueMap.containsKey(num)) {
                values.add(num);
                keyValueMap.put(num, keyValueMap.get(num) - 1);
            }
        }

        return values.stream().mapToInt(x -> x).toArray();
    }
}
