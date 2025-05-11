package medium.BinarySearch;

import java.util.Arrays;

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        int answer= 0;
        while(low <= high){
            int mid = (high+low)/2;
            int sum = findDivisonSum(nums, mid, threshold);

            if(sum <= threshold){
                answer = mid;
                low = mid+1;
            }else {
                high = mid-1;
            }

        }

        return answer;
    }

    private int findDivisonSum(int[] nums, int divisor, int threshold){
        int sum = 0;

        for(int num: nums){
            sum+= Math.ceil(num/divisor);
        }

        return sum;
    }
}
