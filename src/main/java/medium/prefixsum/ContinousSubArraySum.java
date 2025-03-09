package medium.prefixsum;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */

public class ContinousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer , Integer> sumMod = new HashMap<>();
        sumMod.put(0,-1);

        int sum = 0;
        for(int i= 0 ; i < nums.length; i++){
            sum += nums[i];

            int mod = sum%k;
            if(sumMod.containsKey(mod)){
                if(i - sumMod.get(mod) >= 2){
                    return true;
                }
            }else{
                sumMod.put(mod,i);
            }
        }

        return false;
    }
}
