package medium.dp;

public class HouseRobber {
    public int rob(int[] nums) {
        int prevRob = 0;
        int maxRob = nums[0];

        if(nums.length == 1){
            return maxRob;
        }

        for(int i=1; i < nums.length; i++){
            int temp = Math.max(nums[i] + prevRob, maxRob);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }
}
