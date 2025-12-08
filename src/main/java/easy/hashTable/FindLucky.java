package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class FindLucky {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int res = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == key && key > res) {
                res = key;
            }
        }

        return res;
    }
}
