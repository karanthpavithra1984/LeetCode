package medium.prefixsum;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity - o(n)
 * Space Complexity - Maximum - o(n) if the maxlength is all of the array
 */

public class MaximumSubarrayLen {
    public int maxSubArrayLen(int[] nums, int k) {
        int maxLength = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumMapping = new HashMap<>();

        for(int i = 0 ; i< nums.length; i++){
            prefixSum += nums[i];

            if(prefixSum == k){
                maxLength = i+1;
            }

            int subArraySum = prefixSum - k;
            if(prefixSumMapping.containsKey(subArraySum)){
                maxLength = Math.max(maxLength, i- prefixSumMapping.get(subArraySum));
            }

            if(!prefixSumMapping.containsKey(prefixSum))
                prefixSumMapping.put(prefixSum, i);
        }

        return maxLength;
    }
}
