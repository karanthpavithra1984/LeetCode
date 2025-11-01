package easy.twopointers;

public class sortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int oddIndex = 1;
        int evenIndex = 0;

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[evenIndex] = nums[i];
                evenIndex += 2;
            } else {
                ans[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }

        return ans;

    }
}
