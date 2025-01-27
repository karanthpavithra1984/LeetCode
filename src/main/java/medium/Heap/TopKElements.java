package medium.Heap;

import java.util.*;

public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) return nums;
        // Time - o(n) , space o(n)
        Map<Integer, Integer> numberOfOccurances = new HashMap<>();
        for (int num : nums) {
            numberOfOccurances.put(num, numberOfOccurances.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> kTheFrequentElements = new PriorityQueue<>(Comparator.comparingInt(numberOfOccurances::get));

        //Time o(nlogk) ,o(k)
        for (Integer occur : numberOfOccurances.keySet()) {
            kTheFrequentElements.add(occur);
            if (kTheFrequentElements.size() > k) {
                kTheFrequentElements.poll();
            }
        }

        //Time k* log(k) for the polling , since heap has to reshuffle.
        //Space space of the result which is k
        int[] result = new int[k];
        int start = 0;
        while (kTheFrequentElements.size() > 0) {
            result[start++] = kTheFrequentElements.poll();
        }


        return result;
    }
}
