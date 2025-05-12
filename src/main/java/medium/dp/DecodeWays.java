package medium.dp;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    Map<Integer, Integer> map = new HashMap<>();

    public int numDecoding(String s) {
        return dfs(s, 0);
    }

    private int dfs(String s, int i) {
        if (i >= s.length()) {
            return 1;
        }
        if (map.containsKey(i)) {
            return map.get(i);
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        int res = dfs(s, i + 1);
        if (i + 1 < s.length() && (
                (s.charAt(i) == '1') || (s.charAt(i) == '2' && s.charAt(i + 1) < '7'))) {
            res += dfs(s, i + 2);
        }

        map.put(i, res);
        return res;
    }
}
