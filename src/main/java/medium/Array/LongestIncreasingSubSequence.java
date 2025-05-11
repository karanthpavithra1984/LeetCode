package medium.Array;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSequence {
    public int lengthOfLIS(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        numList.add(nums[0]);

        for(int i=1; i < nums.length; i++){
            //If the next number is greater than previous add it
            if(nums[i] > numList.get(numList.size()-1)){
                numList.add(nums[i]);
            }else{
                int j=0;
                while(nums[i] > numList.get(j)){
                    j+=1;
                }
                numList.set(j, nums[i]);
            }
        }

        return numList.size();
    }
}
