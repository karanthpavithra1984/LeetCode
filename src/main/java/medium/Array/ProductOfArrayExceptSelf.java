package medium.Array;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];

        leftProduct[0] = 1;

        for(int i=0; i < nums.length-1; i++){
            leftProduct[i+1] = leftProduct[i] * nums[i];
        }

        int[] rightProduct = new int[nums.length];

        rightProduct[nums.length-1] = 1;

        for(int j= nums.length-1; j>0; j--){
            rightProduct[j-1] = rightProduct[j] * nums[j];
        }

        int[] answers = new int[nums.length];

        for(int i=0; i < nums.length; i++){
            answers[i] = leftProduct[i] * rightProduct[i];
        }

        return answers;
    }
}
