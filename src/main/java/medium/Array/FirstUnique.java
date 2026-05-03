package medium.Array;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstUnique {

    private final Set<Integer> set = new LinkedHashSet<>();
    private final Map<Integer, Boolean> uniqueMap = new HashMap<>();

    public FirstUnique(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.add(nums[i]);
        }
    }

    public int showFirstUnique() {
        if (!set.isEmpty()) {
            return set.iterator().next();
        }

        return -1;
    }

    public void add(int value) {
        if (!uniqueMap.containsKey(value)) {
            uniqueMap.put(value, true);
            set.add(value);
        } else if (uniqueMap.get(value)) {
            uniqueMap.put(value, false);
            set.remove(value);
        }
    }
}
