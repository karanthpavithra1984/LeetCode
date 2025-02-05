package medium.twopointers;

import java.util.Arrays;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int tripletCount = 0 ;

        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if(sum < target) {
                    //If the last index , first and second index are less than sum ,
                    //Then you can safely assume, that all the possible points between left and right are less than target as well
                    tripletCount+= right-left;
                    left++;
                }else{
                    right--;
                }
            }
        }

        return tripletCount;
    }
}
