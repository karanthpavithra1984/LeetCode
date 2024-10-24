package medium.Array;

import java.util.ArrayList;
import java.util.List;
/**
 * Time Complexity o(n)
 * Space Complexity o(n) - but o(1) for the operation and o(n) for list
 */
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> array = new ArrayList<>();
        for(int i= 0 ; i < nums.length; i++){
            int newIndex = Math.abs(nums[i]) - 1;

            //If negative, then its a duplicate , add the index to the list
            if(nums[newIndex] < 0){
                array.add(newIndex+1);
            }else{
                //else make it negative
                nums[newIndex] = nums[newIndex] * -1;
            }
        }

        return array;
    }
}
