package easy.Math;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity o(n)
 * Space Complexity o(n)
 */

public class ConfusingNumbers {
    public boolean confusingNumber(int n) {
        Map<Character, Character> map = new HashMap<>() {{
            put('0', '0');
            put('1', '1');
            put('6', '9');
            put('9', '6');
            put('8', '8');
        }};

        char[] charArray = String.valueOf(n).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!map.containsKey(c)) {
                return false;
            }
            sb.append(map.get(c));
        }

        sb.reverse();
        return !sb.toString().equals(String.valueOf(n));
    }

}
