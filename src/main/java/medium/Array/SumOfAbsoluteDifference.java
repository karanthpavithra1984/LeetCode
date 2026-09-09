package medium.Array;

public class SumOfAbsoluteDifference {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int rightSum = 0;
        int N = nums.length;

        //Intuition -Left total = ( nums[i] - nums[i-1] ) + (nums[i]  - nums[i-2]) ... (nums[i] - nums[0]) = i * nums[i] - (sum of all elements to the left)
        //Intuition - right total = (nums[i+1]- nums[i]) ...( nums[n-1] + nums[i]) = sum of all elements to the right - (n-i)*nums;

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            rightSum = totalSum - leftSum;

            int leftTotal = i * nums[i] - leftSum;
            int rightTotal = rightSum - (N - i) * nums[i];

            answer[i] = leftTotal + rightTotal;
            leftSum += nums[i];
        }

        return answer;
    }
}
