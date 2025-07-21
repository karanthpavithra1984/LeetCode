package easy.Array;

public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int[] returnArray = new int[2];
        returnArray[1] = 1;

        //Negate the numbers which were found and if the number is already negative then the number has been found already
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                returnArray[0] = Math.abs(num);
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                returnArray[1] = i + 1;
                break;
            }
        }

        return returnArray;
    }
}
