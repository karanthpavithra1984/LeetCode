package medium.greedy;

import java.util.Arrays;

public class DivideArray {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int N = nums.length;

        int[][] result = new int[N/3][3];
        for(int i=0; i < N; i+=3){
            if(nums[i+2] - nums[i] > k){
                return new int[0][0];
            }

            result[i/3][0] = nums[i];
            result[i/3][1] = nums[i+1];
            result[i/3][2] = nums[i+2];
        }

        return result;
    }
}
