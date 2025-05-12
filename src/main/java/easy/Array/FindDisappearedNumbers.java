package easy.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n)
 * Space Complexity o(n) - but o(1) for the operation and o(n) for list
 */

public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Mark the index if the number is already in the nums.
        for (int i = 0; i < nums.length; i++) {
            //If the value is 4 , then mark the 4th value i.e index 3 as -1
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }

        List<Integer> arrayList = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) {
                arrayList.add(j + 1);
            }
        }

        return arrayList;
    }
}
