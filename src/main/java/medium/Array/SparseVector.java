package medium.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SparseVector {
    /**
     * Time Complexity - o(size of nums1 + size of nums2 + size of the minimum hashmap length)
     * Space Complexity - o(size of both the hashMaps)
     */
    Map<Integer, Integer> map;

    SparseVector(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                map.put(i, nums[i]);
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int sum = 0;
        Set<Integer> keys = map.size() > vec.map.size() ? vec.map.keySet() : map.keySet();
        for (int key : keys) {
            if (map.get(key) != null && vec.map.get(key) != null)
                sum += map.get(key) * vec.map.get(key);
        }

        return sum;
    }
}