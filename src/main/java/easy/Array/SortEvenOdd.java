package easy.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortEvenOdd {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> oddQueue = new PriorityQueue<>();
        PriorityQueue<Integer> evenQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i < nums.length; i++){
            if(i % 2 == 0){
                evenQueue.offer(nums[i]);
            }else{
                oddQueue.offer(nums[i]);
            }
        }
        int index = 0;
        while(!evenQueue.isEmpty()){
            nums[index] = evenQueue.poll();
            index +=2;
        }

        index = 1;
        while(!oddQueue.isEmpty()){
            nums[index] = oddQueue.poll();
            index += 2;
        }

        return nums;

    }
}
