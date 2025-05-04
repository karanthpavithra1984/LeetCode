package easy.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    /**
     * Time Complexity o(nlogn)
     * @param stones
     * @return
     */
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones){
            queue.offer(stone);
        }

        while(!queue.isEmpty() && queue.size() > 1){
            int x = queue.poll();
            int y = queue.poll();
            if(x != y){
                queue.offer(Math.abs(x-y));
            }
        }

        return queue.isEmpty() ? 0: queue.poll();
    }
}
