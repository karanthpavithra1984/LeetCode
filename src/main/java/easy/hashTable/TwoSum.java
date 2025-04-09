package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    Map<Integer, Integer> integerMap;

    public TwoSum() {
        integerMap = new HashMap();
    }

    public void add(int number) {
        integerMap.put(number, integerMap.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (int key : integerMap.keySet()) {
            int complement = value - key;
            if (complement != key && integerMap.containsKey(complement)) {
                return true;
            } else if (integerMap.containsKey(complement) && integerMap.get(key) > 1) {
                return true;
            }
        }

        return false;
    }
}
