package medium.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */

public class SumOfDistances {
    public long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        Map<Integer, List<Integer>> mapValues = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            if(!mapValues.containsKey(nums[i])){
                mapValues.put(nums[i], new ArrayList<>());
            }
            mapValues.get(nums[i]).add(i);
        }


        for(List<Integer> indices : mapValues.values()) {
            int n = indices.size();
            long sum = 0;
            for(int i = 0; i < n; i++) {
                sum += indices.get(i);
            }
            /**
             * Mathematical equation
             * [1,3,1,1,2,1] = [A,B,C,D,E,F]
             * Array has 4 indexes with 1 - 0,2,3,5
             * So for the first element , there is no left sum , right sum is -  (A-C) + (A-D) + (A-F) = 3*A - (C+D+F) - i.e (n-i)*index - rightsum
             *
             * For the third Element , left sum is (D-A) + (D-C) -  2*D - (C+A) - ie i*index - leftSum
             *
             * For the array   = [2,1,3,1,1,4,1] = [A,B,C,D,E,F,G] -
             * Array has 4 indexes with 1 - 1,3,4,6
             * For the first element there is no left , right sum is - (B-D) + (B-E) + (B-G) = 3*B - (D +E +G) - i.e (n-i)*index - rightsum.
             * For teh third element left Sum is (E-B) + (E-D) = 2*E - (B + D) - i.e i*index - leftSum
             * for the fourth element left Sum is (G-E) + (G-D) + (G-B) = 3*G - (B+D+E) i*index - leftSum
             */
            long leftsum = 0;
            long rightsum = sum;
            long currsum = 0;
            for(int i = 0; i < n; i++) {
                currsum = 0;
                //add the leftSum - i*index - leftSum
                currsum += Math.abs((long)i*indices.get(i) - leftsum);
                //Add the rightSum - (n-i)*index - rightsum.
                currsum += Math.abs((long)(n-i)*indices.get(i) - rightsum);
                leftsum += (long)indices.get(i);
                rightsum -= (long)indices.get(i);
                ans[indices.get(i)] = currsum;
            }
        }
        return ans;
    }

}
