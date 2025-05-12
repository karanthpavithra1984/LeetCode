package medium.twopointers;

import org.junit.Test;
import utils.GeneralUtils;

public class NextPermutationTest {
    NextPermutation nextPermutation = new NextPermutation();

    @Test
    public void nextPermutation() {
        int[] nums = new int[]{1, 2, 3};
        nextPermutation.nextPermutation(nums);
        GeneralUtils.compareValues(
                nums, new int[]{1, 3, 2});

        int[] nums2 = new int[]{3, 2, 1};
        nextPermutation.nextPermutation(nums2);
        GeneralUtils.compareValues(
                nums2, new int[]{1, 2, 3});
    }
}
