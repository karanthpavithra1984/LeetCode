package medium.Array;

import java.util.Arrays;

public class MaxCountII {
    public int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int j = 0, counter = 0;
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            if (j < banned.length && banned[j] == i) {
                j++;
                continue;
            }

            sum += i;
            if (sum > maxSum) {
                return counter;
            }

            counter++;
        }

        return counter;
    }
}
