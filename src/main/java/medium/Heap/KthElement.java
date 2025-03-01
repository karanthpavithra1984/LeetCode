package medium.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElement {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        //Time Complexity n*n*logk

        //Space complexity at the max u will have k
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(queue.size() < k){
                    queue.offer(matrix[i][j]);
                }else {
                    if(matrix[i][j] < queue.peek()){
                        queue.poll();
                        queue.offer(matrix[i][j]);
                    }
                }
            }
        }

        return queue.peek();
    }
}
