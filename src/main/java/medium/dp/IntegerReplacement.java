package medium.dp;

import java.util.HashMap;
import java.util.Map;

public class IntegerReplacement {

    public int integerReplacement(int n) {
        if (n == Integer.MAX_VALUE)
            return 32;

        Map<Integer, Integer> countMap = new HashMap<>();
        return find(n, countMap);
    }

    private int find(int n, Map<Integer, Integer> countMap) {
        if (n == 1)
            return 0;
        if (countMap.containsKey(n)) {
            return countMap.get(n);
        }

        if (n % 2 == 0)
            return 1 + find(n / 2, countMap);
        int pick = 1 + find(n + 1, countMap);
        int notPick = 1 + find(n - 1, countMap);

        int finalPick = Math.min(pick, notPick);

        countMap.put(n, finalPick);

        return countMap.get(n);

    }
}
