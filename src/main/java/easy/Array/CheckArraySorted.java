package easy.Array;

public class CheckArraySorted {
    /**
     * Time Complexity o(n)
     *
     * @param nums
     * @return
     */
    public boolean check(int[] nums) {
        int decreasingNumbers = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                decreasingNumbers++;
                if (decreasingNumbers > 1) {
                    return false; // If you find two decreasing numbers , then return false
                }
            }
        }

        //If the first number is less than the last number and if there decreasing numbers, then its not sorted
        if ((nums[0] < nums[nums.length - 1]) && decreasingNumbers > 0) {
            return false;
        }

        return decreasingNumbers <= 1;
    }
}
