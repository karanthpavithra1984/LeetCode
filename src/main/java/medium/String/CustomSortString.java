package medium.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity - o(n + m)
 * Space Complexity - o(n)
 */

public class CustomSortString {
    public String customSortString(String order, String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (Character c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : order.toCharArray()) {
            while (frequency.containsKey(c) && frequency.get(c) > 0) {
                sb.append(c);
                frequency.put(c, frequency.get(c) - 1);
            }
        }

        for (Character c : frequency.keySet()) {
            int count = frequency.get(c);
            while (count > 0) {
                sb.append("" + c);
                count--;
            }
        }
        return sb.toString();
    }
}
