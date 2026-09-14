package medium.greedy;

import java.util.Arrays;

public class LargestPerimeter {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long totalSum = 0, maxPerimeter = -1;

        for(int num: nums){

            //So basically the longest side should be less than sum of of the smaller sides
            if(totalSum > num){
                maxPerimeter = totalSum + num;
            }

            totalSum += num;
        }

        return maxPerimeter;
    }
}
