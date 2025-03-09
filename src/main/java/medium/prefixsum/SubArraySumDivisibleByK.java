package medium.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> reminderMap = new HashMap<>();
        reminderMap.put(0,1);
        int sum = 0;
        int result = 0;

        for(int num: nums){
            sum += num;

            int reminder = sum%k;


            if(reminder < 0 ){
                reminder += k;
            }



            if(reminderMap.containsKey(reminder)){
                result += reminderMap.get(reminder);
            }

            reminderMap.put(reminder, reminderMap.getOrDefault(reminder, 0) +1);
        }

        return result;
    }
}
