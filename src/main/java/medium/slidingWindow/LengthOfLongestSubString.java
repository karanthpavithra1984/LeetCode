package medium.slidingWindow;

import java.util.*;

public class LengthOfLongestSubString {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length() <= 2){
            return s.length();
        }
        Map<Character, Integer> uniqueChars = new HashMap<>();

        int left = 0 , right = 0;
        int maxLength = 2;

        while(right < s.length()){
            uniqueChars.put(s.charAt(right), right);

            if(uniqueChars.size()  == 3){
                int deleteIndex = uniqueChars.values().stream().mapToInt(x -> x).min().getAsInt();
                uniqueChars.remove(s.charAt(deleteIndex));
                left = deleteIndex+1;
            }
            right++;

            maxLength = Math.max(maxLength, right-left);
        }
        return maxLength;
    }
}
