package easy.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones){
            priorityQueue.offer(stone);
        }

        while(priorityQueue.size() > 1){
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();
            if(x != y){
                priorityQueue.offer(Math.abs(x-y));
            }
        }

        return priorityQueue.size()>0? priorityQueue.poll(): 0;
    }
}
