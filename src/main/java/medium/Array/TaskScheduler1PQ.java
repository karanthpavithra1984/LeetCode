package medium.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler1PQ {
    public int leastInterval(char[] tasks, int n) {
        int[] charFreq = new int[26];

        for (char task : tasks) {
            charFreq[task - 'A']++;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        //Add the frequency to the queue
        for (int freq : charFreq) {
            if (freq > 0) {
                priorityQueue.offer(freq);
            }
        }

        int time = 0;

        while (!priorityQueue.isEmpty()) {
            List<Integer> remaining = new ArrayList<>();
            int task = 0;
            //Run cycles of n
            for (int i = 0; i < n + 1; i++) {
                if (!priorityQueue.isEmpty()) {
                    //Get the one with maximum frequency and fill it up
                    int count = priorityQueue.poll();

                    if (count > 1) {
                        remaining.add(count - 1);
                    }
                    task++;
                }
            }
            //Since we polled from the priority queue ,some tasks might be missing
            //So add those back
            remaining.forEach(priorityQueue::offer);
            //Now we have the tasks
            //if the queue is empty, then we have run out of tasks and might not have completed the cycle
            time += (priorityQueue.isEmpty() ? task : n + 1);
        }

        return time;
    }
}
