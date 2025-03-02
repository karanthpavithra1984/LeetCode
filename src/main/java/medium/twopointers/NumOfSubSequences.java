package medium.twopointers;

import java.util.Arrays;

public class NumOfSubSequences {
    /**
     * Time Complexity o(nlogn)
     * @param nums
     * @param target
     * @return
     */
    public int numSubseq(int[] nums, int target) {
        final int MOD = 1000000007;
        Arrays.sort(nums);

        int[] power = new int[nums.length];
        power[0] = 1;

        for(int i = 1; i < nums.length; i++){
            //Each number in the array will have 2 power of index number of subsequences
            power[i] = (power[i-1] * 2) % MOD;
        }

        int left = 0 , right = nums.length - 1;
        int answer = 0;

        while(left <= right){
            if(nums[left] + nums[right] <= target){
                //Get all the possible subsequence
                answer += power[right-left];
                answer = answer % MOD;
                left++;
            }else{
                right--;
            }
        }

        return answer;
    }
}
