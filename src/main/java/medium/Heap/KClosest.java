package medium.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

import static java.lang.Math.pow;

public class KClosest {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        for(int i = 0; i < points.length; i++){
            int[] point = points[i];
            int distance = (int) (Math.abs(Math.pow(point[0],2 )) + Math.abs(Math.pow(point[1],2)));
            queue.offer(new int[]{i, distance});
        }

        int[][] answers = new int[k][];
        int i=0;
        while(k > 0){
            int[] polled= queue.poll();
            answers[i] = new int[]{points[polled[0]][0],points[polled[0]][1] };
            k--;
            i++;
        }

        return answers;
    }
}
