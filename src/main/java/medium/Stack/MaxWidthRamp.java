package medium.Stack;

import java.util.Stack;

public class MaxWidthRamp {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int maxWidth = 0;

        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                int tmp = stack.pop();
                maxWidth = Math.max(maxWidth, j - tmp);
            }
        }

        return maxWidth;
    }
}
