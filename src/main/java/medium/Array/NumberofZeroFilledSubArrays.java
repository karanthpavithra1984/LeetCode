package medium.Array;

public class NumberofZeroFilledSubArrays {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0 , numOfConsecutive = 0;

        for(int num: nums){
            if(num == 0){
                numOfConsecutive ++;
            }else {
                numOfConsecutive = 0;
            }

            total += numOfConsecutive;
        }

        return total;
    }
}
