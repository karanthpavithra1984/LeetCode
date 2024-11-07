package medium.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        int totalSub = 0;

        int sum = 0;
        for(int num: nums){
            sum+= num;
            int prefix = sum - k;
            //So for the array 1,2,3 = if the sub array sum is 5 is what we are looking for ,
            //Prefix sum array is 1,3,6 - so 6-1 i.e index 2 - 0 - is 5, so the subarray is 2.
            if(prefixSumMap.containsKey(prefix)){
                totalSub += prefixSumMap.get(prefix);
            }
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return totalSub;
    }
}
