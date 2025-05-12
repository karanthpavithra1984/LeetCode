package easy.hashTable;

import java.util.*;

public class RandomPickIndex {
    Map<Integer, List<Integer>> map = new HashMap<>();
    private Random random = new Random();

    public RandomPickIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<Integer>());
            }

            map.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);

        return list.get(random.nextInt(list.size()));
    }
}
