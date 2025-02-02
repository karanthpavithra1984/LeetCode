package medium.Array;

import java.util.HashMap;
import java.util.Map;

public class GetLargestOutlier {
    public int getLargestOutlier(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        int result = Integer.MIN_VALUE;
        //Example1: 2,3,5,10 - totalSum = 20
        //num = 2, posOutlier - 16
        //num = 3 , posoutlier - 14
        //num = 5 , posOutlier - 10, present in the map and is not equal to num , hence return it.

        //total_sum=2×(sum of special numbers)+(outlier)
        // 2,3 is special number i.e 2*5 + 10 = 20;
        for(int num: numCountMap.keySet()){

            int posOutlier = totalSum - num - num;
            //Either number is not equal to posOutlier or if num is same outlier , make sure it has more than 1 elements
            if((numCountMap.containsKey(posOutlier) && (posOutlier != num || numCountMap.get(posOutlier) > 1))){
                result = Math.max(result, posOutlier);
            }
        }

        return result;
    }
}
