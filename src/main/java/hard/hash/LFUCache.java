package hard.hash;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LFUCache {
    Map<Integer, int[]> keyValueMap;
    Map<Integer, LinkedHashSet<Integer>> frequencyValueMap;
    int minf;
    int capacity;

    public LFUCache(int capacity) {
        //Key value map with frequency
        keyValueMap = new HashMap<>();
        //Frequency Map
        frequencyValueMap = new HashMap<>();
        minf = 0;
        this.capacity = capacity;
    }

    private void insertIntoMaps(int key, int value, int frequency) {
        //Inserts into maps
        keyValueMap.put(key, new int[] { frequency, value });
        if (!frequencyValueMap.containsKey(frequency)) {
            frequencyValueMap.put(frequency, new LinkedHashSet<>());
        }
        frequencyValueMap.get(frequency).add(key);
    }

    public int get(int key) {
        if (!keyValueMap.containsKey(key)) {
            return -1;
        }

        int[] value = keyValueMap.get(key);
        //Now this is not least frequently used.
        int freq = value[0];
        int val = value[1];
        if (freq == 0) {
            return -1;
        }

        Set<Integer> frequencyValues = frequencyValueMap.get(freq);
        //Remove it and add it to a different frequency
        frequencyValues.remove(key);
        //If that was the last value, then increase the minf , because it should be next.
        if (frequencyValues.isEmpty()) {
            frequencyValueMap.remove(freq);
            if (minf == freq) {
                minf++;
            }
        }
        insertIntoMaps(key, val, freq + 1);
        return val;
    }

    public void put(int key, int value) {
        //Now if the key is present
        if (keyValueMap.containsKey(key)) {
            int[] freqVal = keyValueMap.get(key);
            int freq = freqVal[0];
            keyValueMap.put(key, new int[] { freq, value });
            //So basically ur updating the frequencyValueMap again
            get(key);
            return;
        }

        if (capacity == keyValueMap.size()) {
            Set<Integer> keysToDelete = frequencyValueMap.get(minf);
            int keyToDelete = keysToDelete.iterator().next(); //First ONE
            keyValueMap.remove(keyToDelete);
            keysToDelete.remove(keyToDelete);
            if (keysToDelete.isEmpty()) {
                frequencyValueMap.remove(minf);
            }
        }

        //Min frequency is 1
        minf = 1;
        insertIntoMaps(key, value, 1);
    }
}
