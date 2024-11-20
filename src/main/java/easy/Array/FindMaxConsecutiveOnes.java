package easy.Array;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int num: nums){
            if(num ==0 ){
                count = 0;
            }else{
                max = Math.max(max, ++count);
            }
        }

        return max;
    }

}
