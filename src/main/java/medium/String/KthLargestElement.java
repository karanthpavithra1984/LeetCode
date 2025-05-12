package medium.String;

import java.util.Arrays;

public class KthLargestElement {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (o1, o2) -> {
            if (o1.length() != o2.length()) return o2.length() - o1.length();
            else return o2.compareTo(o1);
        });

        return nums[k - 1];
    }
}
