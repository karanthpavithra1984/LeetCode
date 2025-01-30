package hard.twoHeap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Time Complexity - o(nlogn) - n elements and around 5-6 times of heap add and delete
 * Space Complexity - o(n) (hasmap) + o(k)queue
 */
public class SlidingWindowMedian {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    Map<Integer, Integer> removed = new HashMap<>();

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] res = new double[nums.length - k + 1];

        initializeFirstK(nums, k);
        int resultCounter = 0;
        for (int i = k; i < nums.length; i++) {
            res[resultCounter] = median(k);
            int outGoing = nums[i - k];
            int balance = outGoing <= minHeap.peek() ? -1 : 1;
            removed.put(outGoing, removed.getOrDefault(outGoing, 0) + 1);

            if (nums[i] <= minHeap.peek()) {
                minHeap.add(nums[i]);
                balance++;
            } else {
                maxHeap.add(nums[i]);
                balance--;
            }

            if (balance < 0) {
                minHeap.add(maxHeap.poll());
            }
            if (balance > 0) {
                maxHeap.add(minHeap.poll());
            }

            while (!minHeap.isEmpty() && removed.getOrDefault(minHeap.peek(), 0) > 0) {
                int a = minHeap.poll();
                removed.put(a, removed.get(a) - 1);
            }
            while (!maxHeap.isEmpty() && removed.getOrDefault(maxHeap.peek(), 0) > 0) {
                int a = maxHeap.poll();
                removed.put(a, removed.get(a) - 1);
            }

            resultCounter++;

        }

        res[resultCounter] = median(k);

        return res;
    }

    private void initializeFirstK(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
            minHeap.add(maxHeap.poll());
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.add(minHeap.poll());
            }
        }
    }

    private double median(int k) {
        if (k % 2 == 0) {
            return (minHeap.peek() * .5 + maxHeap.peek() * .5);
        } else {
            return minHeap.peek();
        }
    }

}
