package medium.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDistance {
    Map<String, List<Integer>> wordIndexMap = new HashMap<>();
    public WordDistance(String[] wordsDict) {
        for(int i=0; i < wordsDict.length; i++){
            String word = wordsDict[i];
            if(!wordIndexMap.containsKey(word)){
                wordIndexMap.put(word, new ArrayList<>());
            }

            wordIndexMap.get(word).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> location1 = wordIndexMap.get(word1);
        List<Integer> location2 = wordIndexMap.get(word2);

        int loc1 = 0, loc2 = 0, minDiff = Integer.MAX_VALUE;
        while(loc1 < location1.size() && loc2 < location2.size()){
            minDiff = Math.min(minDiff, Math.abs(location1.get(loc1) - location2.get(loc2)));

            if(location1.get(loc1) < location2.get(loc2)){
                loc1++;
            }else{
                loc2++;
            }
        }

        return minDiff;
    }
}
