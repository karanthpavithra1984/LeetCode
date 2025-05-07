package medium.Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxEvents {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int start = 0;

        for(int d=1;d<=100000;d++){
            //Any event that is already over just remove them
            while(!queue.isEmpty() && queue.peek() < d){
                queue.poll();
            }

            //Add the end time of the event to the queue , so they are stacked in ascending order
            while(events[start][0] <= d){
                queue.offer(events[start][1]);
                start++;
            }

            if(!queue.isEmpty()){
               //Cover the events which are on the top
               queue.poll();
                answer++;
            }

            //Add the end case
            if(queue.isEmpty() && start == events.length){
                break;
            }
        }
        return answer;
    }
}
