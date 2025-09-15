package easy.Heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HighFive {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            if(!map.containsKey(item[0])){
                map.put(item[0], new PriorityQueue<>(Comparator.reverseOrder()));
            }
            map.get(item[0]).add(item[1]);
        }

        int[][] result = new int[map.size()][2];
        int index = 0;
        for(Integer key : map.keySet()){
            int top = 5;
            int sum = 0;
            while(top > 0){
                sum += map.get(key).poll();
                top--;
            }

           result[index++] = new int[]{key, sum/5};
        }

        return result;
    }
}
