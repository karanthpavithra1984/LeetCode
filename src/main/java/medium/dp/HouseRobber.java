package medium.dp;

public class HouseRobber {
    public int rob(int[] nums) {
       int prevRob =0, maxRob = nums[0];

       for(int i=1; i < nums.length;i++){
           int temp = maxRob;
           maxRob = Math.max(nums[i]+prevRob, maxRob);
           prevRob = temp;
       }

       return maxRob;
    }
}
