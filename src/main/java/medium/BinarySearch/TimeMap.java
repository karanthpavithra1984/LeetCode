package medium.BinarySearch;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    Map<String, List<Pair<Integer, String>>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!timeMap.containsKey(key)) {
            timeMap.put(key, new ArrayList<>());
        }

        timeMap.get(key).add(Pair.of(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!timeMap.containsKey(key)) {
            return "";
        }

        List<Pair<Integer, String>> values = timeMap.get(key);

        //If time stamp is less than first value
        if (timestamp < values.get(0).getKey()) {
            return "";
        }

        //Binary search to get the next previous value
        int left = 0;
        int right = values.size();


        //Get the next lesser value

        while (left < right) {
            int middle = (left + right) / 2;

            if (timestamp >= values.get(middle).getKey()) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return values.get(right - 1).getValue();
    }
}
