package easy.Heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Time Complexity o(nlogk) - logk - priority queue add and we iterate n times
 * Space Complexity o(n)
 */
public class FindMinOrMax {
    public int findNonMinOrMax(int[] nums) {

        if (nums.length <= 2) {
            return -1;
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num : nums) {
            priorityQueue.offer(num);
        }

        priorityQueue.poll();
        return priorityQueue.peek();

    }
}
