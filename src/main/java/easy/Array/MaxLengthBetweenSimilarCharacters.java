package easy.Array;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthBetweenSimilarCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        Integer maxDistance = -1;
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(characterIntegerMap.containsKey(ch)){
                maxDistance = Math.max(characterIntegerMap.get(ch) , maxDistance);
            }

            characterIntegerMap.put(ch, s.indexOf(ch));
        }

        return maxDistance;
    }
}
