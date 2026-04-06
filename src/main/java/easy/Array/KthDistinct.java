package easy.Array;

import java.util.HashMap;
import java.util.Map;

public class KthDistinct {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freqMap = new HashMap<>();

        for(String ar : arr){
            freqMap.put(ar, freqMap.getOrDefault(ar, 0) + 1);
        }

        for(String ar: arr){
            if(freqMap.get(ar) == 1){
                k--;
            }

            if(k == 0){
                return ar;
            }
        }

        return "";

    }
}
