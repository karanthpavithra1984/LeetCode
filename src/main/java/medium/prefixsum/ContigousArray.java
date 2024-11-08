package medium.prefixsum;

import java.util.HashMap;
import java.util.Map;

/**
 * Its basically maximum sub array len with the k 0
 *
 * Time Complexity 0(n)
 * Space complexity o(1)
 */

public class ContigousArray {
    public int findMaxLength(int[] nums) {
      Map<Integer, Integer> prefixSumMap = new HashMap<>();
      prefixSumMap.put(0, -1);
      int prefixSum = 0;
      int maxLength = 0;

      for(int i = 0 ; i < nums.length ;i++){
          prefixSum += nums[i] == 1?1: -1;

          if(prefixSumMap.containsKey(prefixSum)){
              maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum));
          }else
              prefixSumMap.put(prefixSum, i);
      }

      return maxLength;
    }
}
