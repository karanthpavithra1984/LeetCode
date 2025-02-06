package medium.Stack;

import java.util.Stack;

public class NextGreaterElementII {
    Stack<Integer> stack = new Stack<>();
    int[] res;

    /**
     * Time Complexity - 2 times through processThrough so 2n
     * Space complexity - for the result which is o(n)
     * @param nums
     * @return
     */
    public int[] nextGreaterElements(int[] nums) {
        res = new int[nums.length];
        stack.clear();
        processThrough(nums);
        processThrough(nums);

        return res;
    }

    private void processThrough(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[i] >= nums[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                res[i] = nums[stack.peek()];
            } else {
                res[i] = -1;
            }

            stack.push(i);
        }
    }
}
