package easy.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProductDifference {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length-1] * nums[nums.length -2] - nums[0]*nums[1];
    }
}
