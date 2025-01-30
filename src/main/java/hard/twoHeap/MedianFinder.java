package hard.twoHeap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Double> minHeap;
    PriorityQueue<Double> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap = new PriorityQueue<>();
    }

    /**
     * Inserting/Deleting from a priorityQueue takes around o(logn) - We have around 7
     * Peeking takes o(1) so o(logn)
     *
     * Space Complexity is o(n)
     * @param num
     */

    public void addNum(int num) {
        minHeap.add(Double.valueOf(num));

        //If minHeap value is greater than maxHeap ,then move it to maxHeap
        if(minHeap.size() > 0 && maxHeap.size() > 0 && minHeap.peek() > maxHeap.peek()) {
            maxHeap.offer(minHeap.poll());
        }
        if(minHeap.size() > maxHeap.size() + 1){ //If the size is uneven then move it
            maxHeap.offer(minHeap.poll());
        }

        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }else if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }

        return (minHeap.peek() + maxHeap.peek()) / 2;
    }
}
