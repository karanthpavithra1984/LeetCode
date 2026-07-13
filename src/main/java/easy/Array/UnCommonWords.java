package easy.Array;

import java.util.*;

public class UnCommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> valueMap = new HashMap<>();

        for(String str: s1.split("\\s+")){
           valueMap.put(str, valueMap.getOrDefault(str, 0) + 1);
        }

        for(String str: s2.split("\\s+")){
           valueMap.put(str, valueMap.getOrDefault(str, 0) + 1);
        }

        List<String> values = new LinkedList<>();

        for(String s: valueMap.keySet()){
            if(valueMap.get(s) == 1){
                values.add(s);
            }
        }

        return values.toArray(new String[0]);
    }
}
