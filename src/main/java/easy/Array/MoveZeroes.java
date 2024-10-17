package easy.Array;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFound = -1;
        //Move them front
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0){
                lastNonZeroFound++;
                nums[lastNonZeroFound] = nums[i];
            }
        }

        //Fill them up with 0
        for(int j= lastNonZeroFound+1; j < nums.length; j++){
            nums[j] = 0 ;
        }
    }

}
