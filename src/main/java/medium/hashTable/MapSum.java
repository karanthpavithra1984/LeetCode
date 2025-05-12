package medium.hashTable;

import java.util.HashMap;
import java.util.Map;

public class MapSum {
    Map<String, Integer> hashMap;
    //Pre calculate Prefixes if possible
    Map<String, Integer> prefixMap;

    public MapSum() {
        hashMap = new HashMap<>();
        prefixMap = new HashMap<>();
    }

    public void insert(String key, int val) {
        int delta = val - hashMap.getOrDefault(key, 0);
        hashMap.put(key, val);
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : key.toCharArray()) {
            stringBuilder.append(character);
            prefixMap.put(stringBuilder.toString(),
                    prefixMap.getOrDefault(stringBuilder.toString(), 0) + delta);
        }
    }

    public int sum(String prefix) {
        return prefixMap.getOrDefault(prefix, 0);
    }
}
