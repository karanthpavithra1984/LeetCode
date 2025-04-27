package medium.Heap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeastInterval {
    public int leastInterval(char[] tasks, int n) {
        int[] charFreq = new int[26];
        for (char task : tasks) {
            charFreq[task - 'A']++;
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i] > 0) {
                //Just add the count
                priorityQueue.add(charFreq[i]);
            }
        }

        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        while (!priorityQueue.isEmpty() || !queue.isEmpty()) {
            time++;
            if (!priorityQueue.isEmpty()) {
                int count = priorityQueue.poll();

                if (count > 1) {
                    queue.add(new int[]{count - 1, time + n});
                }
            } else {
                //Get the time from the queue , since its the total time
                time = queue.peek()[1];
            }

            //Time is same as the interval completed for the character
            if (!queue.isEmpty() && queue.peek()[1] == time) {
                priorityQueue.add(queue.poll()[0]);
            }

        }

        return time;
    }
}
