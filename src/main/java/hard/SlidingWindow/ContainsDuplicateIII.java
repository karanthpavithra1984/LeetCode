package hard.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        Map<Long, Long> buckets = new HashMap<>();
        long bucketWidth = (long) valueDiff + 1;

        for (int i = 0; i < nums.length; i++) {
            long bucket = Math.floorDiv(nums[i], bucketWidth);
            System.out.println(bucket + "," + nums[i]);

            if (buckets.containsKey(bucket)) {
                //There is already an element with the valueDiff
                return true;
            }
            //Edge cases, check neighboring element
            if (buckets.containsKey(bucket - 1) && Math.abs(nums[i] - buckets.get(bucket - 1)) < bucketWidth)
                return true;

            if (buckets.containsKey(bucket + 1) && Math.abs(nums[i] - buckets.get(bucket + 1)) < bucketWidth)
                return true;

            //put element
            buckets.put(bucket, (long) nums[i]);
            if (i >= indexDiff)
                buckets.remove(Math.floorDiv(nums[i - indexDiff], bucketWidth));
        }

        return false;
    }
}
