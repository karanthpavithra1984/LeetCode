package easy.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < nums.length ; i++){
            pq.offer(nums[i]);
        }

        return (pq.poll() - 1) * (pq.poll() - 1);
    }
}
