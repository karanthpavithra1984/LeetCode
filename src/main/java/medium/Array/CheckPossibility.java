package medium.Array;

public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int numOfVoilations = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                numOfVoilations++;

                if (numOfVoilations > 1) {
                    return false;
                }

                //If first number or if the array is 1,4,2,3 - Since 1 < 2, its okay to change 4 to 2 (index 1)
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else { // same logic but if array is 3,4,2,5 - then we cant change 4 to 2 , we need to change 2 i.e i+1 to 4.
                    nums[i + 1] = nums[i];
                }
            }
        }

        return true;
    }
}
