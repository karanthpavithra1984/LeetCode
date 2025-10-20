package easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBaloon {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
            }
        }
        int count = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            int value = map.get(key);

            if (key == 'l' || key == 'o') {
                value = value / 2;
            }

            count = Math.min(value, count);
        }

        return count;
    }
}
