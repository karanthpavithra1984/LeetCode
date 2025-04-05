package medium.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();

        int leftPointer = 0, rightPointer = 0;
        int length = 0;

        while (leftPointer <= rightPointer && rightPointer < s.length()) {
            char value = s.charAt(rightPointer);

            while (characterSet.contains(value)) {
                characterSet.remove(s.charAt(leftPointer));
                leftPointer++;
            }

            length = Math.max(length, rightPointer - leftPointer + 1);
            characterSet.add(s.charAt(rightPointer));
            rightPointer++;
        }

        return length;
    }
}
