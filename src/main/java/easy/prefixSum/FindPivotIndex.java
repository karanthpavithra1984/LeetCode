package easy.prefixSum;

/**
 * Time Complexity o(2n) ~ o(n)
 * Space complexity o(1)
 */

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0, leftSum = 0;
        for(int n : nums){total += n;}


        //LeftSum should equal to the right sum which is total-leftsum on both sides of the number
        for(int i = 0 ; i < nums.length; i++){
            if(leftSum == (total - leftSum - nums[i])){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
