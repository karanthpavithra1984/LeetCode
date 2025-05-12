package medium.Array;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length() + "#" + str);
        }

        return res.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int start = 0;
        List<String> values = new ArrayList<>();
        while (start < s.length()) {
            int temp = start;
            int number = 0;
            while (s.charAt(temp) != '#') {
                number = number * 10 + (s.charAt(temp) - '0');
                temp++;
            }
            values.add(s.substring(temp + 1, temp + number + 1));
            start = temp + number + 1;
        }

        return values;
    }
}
