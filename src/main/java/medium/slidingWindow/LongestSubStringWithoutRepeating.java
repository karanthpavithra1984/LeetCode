package medium.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();

        int left = 0 , right = 0;
        int maxLength = 0;
        while(right < s.length()){
            Character character = s.charAt(right);

            while(characterSet.contains(character)){
                characterSet.remove(s.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);
            right++;
            characterSet.add(character);
        }

        return maxLength;
    }
}
