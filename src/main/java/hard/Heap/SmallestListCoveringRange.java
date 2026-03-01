package hard.Heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestListCoveringRange {
    public int[] smallestRange(List<List<Integer>> nums) {
        //Use first element as the comparator
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int sizeOfHeap = nums.size();
        //Initialize with first element from each
        //Make sure the heap has one element from each. Initialize with just the first element
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < sizeOfHeap; i++){
            //Get first element from the list
            int number = nums.get(i).get(0);
            // {number, list num , index
            minHeap.offer(new int[]{number, i, 0});
            //Find the maximum value of all the first elemenst in the list
            max = Math.max(number, max);
        }


        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;
        while(minHeap.size() == sizeOfHeap){
            int[] minElement = minHeap.poll();
            int min = minElement[0];
            int listNum = minElement[1];
            int index = minElement[2];

            if(max - min < rangeEnd - rangeStart){
                rangeStart = min;
                rangeEnd = max;
            }

            //Now add the next element from the list and remove the smallest number and recalculate the maximum value from heap again
           //If the index is still valid
            int newIndex = index + 1;
            if(newIndex < nums.get(listNum).size()){
                int number = nums.get(listNum).get(newIndex);
                minHeap.offer(new int[]{number, listNum, newIndex});
                max = Math.max(number, max);
            }else{
                break;
            }
        }

        return new int[]{rangeStart, rangeEnd};
    }
}
