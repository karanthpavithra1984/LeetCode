package medium.Array;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        //Since first and last are connected
        //Go through first house sans the last one
        //Go through houses starting with second house and till the end
        int rob1 = rob(nums, 0, nums.length - 2);
        int rob2 = rob(nums, 1, nums.length - 1);

        return Math.max(rob1, rob2);
    }

    private int rob(int[] nums, int start, int end) {
        //Save two values
        int currentHouse = 0;
        int previousHouse = 0;

        for (int i = start; i <= end; i++) {
            int temp = currentHouse;
            currentHouse = Math.max(previousHouse + nums[i], currentHouse);
            previousHouse = temp;
        }

        return currentHouse;
    }
}
