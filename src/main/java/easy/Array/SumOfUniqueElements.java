package easy.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Time Complexity o(n)
 * Space Complexity o(n)
 */

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean[] visited = new boolean[101];
        int sum = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                if (!visited[num]) {
                    sum -= num;
                }
                visited[num] = true;
            } else {
                set.add(num);
                sum += num;
            }
        }

        return sum;
    }

}
