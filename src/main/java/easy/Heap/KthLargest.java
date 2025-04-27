package easy.Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    Queue<Integer> priorityQueue;
    int k;

    public KthLargest(int k, int[] nums) {
        priorityQueue = new PriorityQueue<>(k);
        this.k = k;

        for (int num : nums) {
            priorityQueue.add(num);
        }

        while (priorityQueue.size() > k) {
            priorityQueue.poll();
        }
    }

    public int add(int val) {
        priorityQueue.add(val);

        if (priorityQueue.size() > k)
            priorityQueue.poll();

        return priorityQueue.peek();
    }
}
