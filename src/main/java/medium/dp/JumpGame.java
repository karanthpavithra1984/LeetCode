package medium.dp;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int destination =nums.length-1;

        for(int i= nums.length-2; i >=0 ;i--){
            if(nums[i] + i >= destination){
                destination = i;
            }
        }

        //Make sure the destination is start
        return destination == 0;
    }
}
