package hard.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;
        int[] output = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        while (right < n) {
            //If the value is greater than last, just remove them
            while (!deque.isEmpty() && nums[right] > nums[deque.getLast()]) {
                deque.removeLast();
            }

            //Remember we are adding index.
            deque.addLast(right);

            if (left > deque.getFirst()) {
                deque.removeFirst();
            }

            if (right - left + 1 == k) {
                output[left] = nums[deque.getFirst()];
                left++;
            }

            right++;
        }

        return output;
    }
}
