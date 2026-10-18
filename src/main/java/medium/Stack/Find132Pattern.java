package medium.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Find132Pattern {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int maxK = Integer.MIN_VALUE;

        Deque<Integer> stack = new ArrayDeque<>();

        //Start from reverse
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < maxK) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                maxK = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
