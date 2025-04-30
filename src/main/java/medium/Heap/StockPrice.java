package medium.Heap;

import java.util.*;

public class StockPrice {
    Map<Integer, Integer> timeStampStockMap;
    PriorityQueue<int[]> minimumHeap;
    PriorityQueue<int[]> maximumHeap;
    private Integer latestTimeStamp;

    public StockPrice() {
        latestTimeStamp = 0;
        minimumHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        maximumHeap = new PriorityQueue<>(Comparator.comparingInt(a -> -a[0]));
        timeStampStockMap = new HashMap<>();
    }

    public void update(int timestamp, int price) {
        latestTimeStamp = Math.max(latestTimeStamp, timestamp);
        timeStampStockMap.put(timestamp, price);
        minimumHeap.offer(new int[]{price, timestamp});
        maximumHeap.offer(new int[]{price, timestamp});
    }

    public int current() {
        return timeStampStockMap.get(latestTimeStamp);
    }

    public int maximum() {
        //Clean up the heap atleast the top ones
        int[] maximum = maximumHeap.peek();
        while(timeStampStockMap.get(maximum[1]) !=  maximum[0]){
            maximumHeap.poll();
            maximum = maximumHeap.peek();
        }

        return maximum[0];
    }

    public int minimum() {
        //Clean up the heap atleast the top ones
        int[] minimum = minimumHeap.peek();
        while(timeStampStockMap.get(minimum[1]) !=  minimum[0]){
            minimumHeap.poll();
            minimum = minimumHeap.peek();
        }

        return minimum[0];
    }
}
