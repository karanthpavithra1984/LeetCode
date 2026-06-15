package easy.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Integer[] boxedNums = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(boxedNums, (a, b) -> {
            if(freqMap.get(a).equals(freqMap.get(b))){
                return Integer.compare(b, a);
            }
            return Integer.compare(freqMap.get(a), freqMap.get(b));
        });

        return Arrays.stream(boxedNums).mapToInt(Integer::intValue).toArray();
    }
}
