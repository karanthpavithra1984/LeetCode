package medium.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestWordDistance {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i= 0; i < wordsDict.length; i++){
            String word = wordsDict[i];
            if(!map.containsKey(word)){
                map.put(word, new ArrayList<>());
            }
            map.get(word).addLast(i);
        }

        int minDiff = Integer.MAX_VALUE;
        List<Integer> indexes = map.get(word1);
        List<Integer> indexes2 = map.get(word2);

        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < indexes.size() && ptr2 < indexes2.size()){
            if(indexes.get(ptr1) == indexes2.get(ptr2)){
                ptr2++;
                continue;
            }
            minDiff = Math.min(minDiff, Math.abs(indexes.get(ptr1) - indexes2.get(ptr2)));

            if(indexes.get(ptr1) < indexes2.get(ptr2)){
                ptr1++;
            }else{
                ptr2++;
            }
        }

        return minDiff;
    }
}
