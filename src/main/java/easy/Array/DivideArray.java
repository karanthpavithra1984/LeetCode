package easy.Array;

import java.util.HashSet;
import java.util.Set;

public class DivideArray {
    public boolean divideArray(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            }else  {
                set.add(num);
            }
        }

        return set.size() == 0;
    }
}
