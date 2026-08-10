package easy.Array;

public class ApplyOperations {
    public int[] applyOperations(int[] nums) {
        int size = nums.length;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1] ){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int zeroIndex = 0;

        for(int i = 0 ; i < nums.length; i++ ){
            if(nums[i] != 0){
                nums[zeroIndex++] = nums[i];
            }
        }

        while(zeroIndex < nums.length){
            nums[zeroIndex++] = 0;
        }

        return nums;
    }
}
