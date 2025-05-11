package medium.mergeIntervals;

import java.util.*;

public class MinAvailableDurationsHeap {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int[] slot : slots1) {
            if (slot[1] - slot[0] >= duration)
                heap.offer(slot);
        }
        for (int[] slot : slots2) {
            if (slot[1] - slot[0] >= duration)
                heap.offer(slot);
        }

        while (heap.size() > 1) {
            int[] slot1 = heap.poll();
            int[] slot2 = heap.peek();

            if (slot1[1] - slot2[0] >= duration) {
                return Arrays.asList(slot2[0], slot2[0] + duration);
            }
        }

        return new ArrayList<>();
    }
}
