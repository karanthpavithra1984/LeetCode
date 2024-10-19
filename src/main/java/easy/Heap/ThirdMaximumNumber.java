package easy.Heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ThirdMaximumNumber {
    /**
     * Time Complexity o(nlogk)
     * Space complexity o(k)
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for(int n: nums){
           if(set.contains(n)){
               continue;
           }

           set.add(n);
           priorityQueue.offer(n);
           if(priorityQueue.size() > 3){
               priorityQueue.poll();
           }
        }

        if(priorityQueue.size() == 2){
            priorityQueue.poll();
           return priorityQueue.peek();
        }

        return priorityQueue.peek();
    }
}
