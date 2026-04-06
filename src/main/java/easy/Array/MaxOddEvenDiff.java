package easy.Array;

import java.util.HashMap;
import java.util.Map;

public class MaxOddEvenDiff {
    public int maxDifference(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            valueMap.put(ch, valueMap.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = 1;
        int minEven = s.length();

        for (int value : valueMap.values()) {
            if (value % 2 == 0) {
                minEven = Math.min(minEven, value);
            } else {
                maxOdd = Math.max(maxOdd, value);
            }
        }

        return maxOdd - minEven;
    }

}
