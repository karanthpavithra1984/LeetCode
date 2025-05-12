package medium.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        //There is no anagram
        if (p.length() > s.length()) {
            return new ArrayList<>();
        }

        int[] pChars = new int[26];
        int[] sChars = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pChars[p.charAt(i) - 'a']++;
            sChars[s.charAt(i) - 'a']++;
        }

        List<Integer> indexes = new ArrayList<>();

        if (Arrays.equals(pChars, sChars)) {
            indexes.add(0);
        }

        int left = 0;
        int right = p.length();

        while (right < s.length()) {
            sChars[s.charAt(left) - 'a']--;
            sChars[s.charAt(right) - 'a']++;

            left++;
            right++;

            if (Arrays.equals(sChars, pChars)) {
                indexes.add(left);
            }
        }

        return indexes;
    }
}
