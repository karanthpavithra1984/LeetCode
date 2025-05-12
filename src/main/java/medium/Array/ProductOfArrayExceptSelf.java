package medium.Array;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            leftProduct[i + 1] = leftProduct[i] * nums[i];
        }

        int[] rightProduct = new int[nums.length];
        rightProduct[nums.length - 1] = 1;

        for (int i = nums.length - 1; i > 0; i--) {
            rightProduct[i - 1] = rightProduct[i] * nums[i];
        }

        int[] answers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answers[i] = leftProduct[i] * rightProduct[i];
        }

        return answers;
    }
}
