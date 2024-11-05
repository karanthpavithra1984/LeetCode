package easy.prefixSum;

public class LeftRightDifference {
    /**
     * Time Complexity o(2n)
     * Space Complexity o(2n) - One for leftSum and the other for difference
     * @param nums
     * @return
     */
    public int[] leftRightDifference(int[] nums) {
        if(nums.length == 1){
            return new int[]{0};
        }
        int[] leftSum = new int[nums.length];
        int[] difference = new int[nums.length];

        for(int i=1; i < nums.length; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        int rightSum = 0;
        difference[nums.length-1] = leftSum[nums.length-1];

        for(int i=nums.length-1; i > 0;i--){
            rightSum += nums[i];
            difference[i-1] = Math.abs(leftSum[i-1] - rightSum);
        }

        return difference;
    }

}
