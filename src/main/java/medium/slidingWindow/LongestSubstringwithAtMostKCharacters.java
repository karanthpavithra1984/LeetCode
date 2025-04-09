package medium.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> characterIndexMap = new HashMap<>();

        int left = 0 , right = 0;
        int maxLength = 0;

        while(right < s.length()){
            Character value = s.charAt(right);
            characterIndexMap.put(value, right);

            if(characterIndexMap.size() > k){
                int deleteIndex = characterIndexMap.values().stream().mapToInt(x ->x).min().getAsInt();
                characterIndexMap.remove(s.charAt(deleteIndex));
                left = deleteIndex+1;
            }


            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }

        return maxLength;
    }
}
