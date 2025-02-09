package medium.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time Complexity o(nlogn)
 * Space complexity o(1) if we exclude output result
 */

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //Sort the array , so that we could do a two sum
        Arrays.sort(nums);

        //Since the array is sorted and we are expected to check if the sum is 0,
        //the first number in the list cant be 0, as we look for next items
        for(int i=0 ; i < nums.length && nums[i] <=0 ; i++){
            if(i==0 || nums[i]!=nums[i-1]) {
                //Avoid duplicates , since two similar values could have same twosum
                twoSum(nums, res, i);
            }
        }

        return res;
    }

    private void twoSum(int[] nums,List<List<Integer>> res, int startPoint) {
        int left = startPoint + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right] + nums[startPoint];
           if(sum > 0) {
                right--;
            }else if(sum < 0){
                left++;
            }else {
               res.add(Arrays.asList(nums[left++], nums[right--], nums[startPoint]));
               //This is tricky , similar to what we did earlier in the threeSum method
               // The equal numbers will create multiple duplicates
               while(left < right && nums[left] == nums[left-1]) left++;
            }
        }
    }
}
