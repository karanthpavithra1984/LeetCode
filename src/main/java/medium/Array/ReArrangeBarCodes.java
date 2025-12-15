package medium.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReArrangeBarCodes {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer,Integer> barCountMap = new HashMap<>();
        for(int barCode: barcodes){
            barCountMap.put(barCode, barCountMap.getOrDefault(barCode,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue() // For descending order
        );

        pq.addAll(barCountMap.entrySet());

        int index = 0;
        while (!pq.isEmpty()){
            Map.Entry<Integer, Integer> value = pq.poll();
            int key = value.getKey();
            int values = value.getValue();
            //Fill up the alternate space
            while(values-->0){
                barcodes[index] = key;
                index+=2;
                if(index > barcodes.length-1){//reset
                    index = 1;
                }
            }
        }

        return barcodes;
    }
}
