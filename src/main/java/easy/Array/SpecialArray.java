package easy.Array;

public class SpecialArray {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 0; i < nums.length-1; i++){
//            if(nums[i]%2 == nums[i+1]%2){
//                return false;
//            }

            //bit wise approach
            //And of a odd with 1 returns and 'and' of a even with 1 returns 0
            //1 ^ 0 is 0.
            if(((nums[i] & 1) ^ (nums[i+1] & 1)) == 0){
                return false;
            }
        }

        return true;
    }
}
