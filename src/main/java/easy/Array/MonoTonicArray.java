package easy.Array;

public class MonoTonicArray {
    /**
     * Worst case o(n)
     * @param nums
     * @return
     */
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        if(nums.length == 1) return true;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i+1] < nums[i]){
                increasing = false;
            }
            if(nums[i+1] > nums[i]){
                decreasing = false;
            }

            if(increasing && decreasing && nums[i+1] != nums[i]){
                return false;
            }
        }

        return increasing || decreasing;
    }
}
