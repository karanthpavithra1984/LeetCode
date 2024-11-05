package easy.prefixSum;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */
public class FindMiddleInIndex {
    public int findMiddleIndex(int[] nums) {
        int right = 0;
        for(int num: nums){
            right += num;
        }

        int left = 0;

        for(int i= 0; i< nums.length ; i++){
            if(left == right - nums[i])
                return i;
            left += nums[i];
            right -= nums[i];
        }

        return -1;
    }
}
