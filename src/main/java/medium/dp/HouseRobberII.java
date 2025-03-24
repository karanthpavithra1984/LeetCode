package medium.dp;

public class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        //Since first and last are connected
        //Rob between first and last but one
        //Second and last One
        int withoutLast = rob(nums, 0, nums.length-2);
        int withLast = rob(nums, 1, nums.length-1);

        return Math.max(withLast, withoutLast);
    }

    private int rob(int[] nums, int start, int end){
        int prevRob = 0;
        int maxRob = 0;

        for(int i= start ; i <= end; i++){
            int temp = Math.max(nums[i] + prevRob, maxRob);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
}
