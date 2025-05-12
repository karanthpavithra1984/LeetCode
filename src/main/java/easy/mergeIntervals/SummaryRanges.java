package easy.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Space Complexity - o(N)
 * Time Complexity - o(1)
 */

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> values = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while ((i + 1 < nums.length) && (nums[i + 1] == nums[i] + 1)) {
                i++;
            }

            if (start != nums[i]) {
                values.add(start + "->" + nums[i]);
            } else {
                values.add("" + start);
            }
        }


        return values;
    }
}
