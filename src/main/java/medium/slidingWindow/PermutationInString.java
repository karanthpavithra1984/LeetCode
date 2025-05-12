package medium.slidingWindow;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1CharCount = new int[26];
        int[] s2CharCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1CharCount[s1.charAt(i) - 'a']++;
            s2CharCount[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1CharCount, s2CharCount)) {
            return true;
        }

        int left = 0;
        int right = s1.length();

        while (right < s2.length()) {
            //Decrease the outgoing
            s2CharCount[s2.charAt(left) - 'a']--;
            //Increase the incoming
            s2CharCount[s2.charAt(right) - 'a']++;
            left++;
            right++;
            if (Arrays.equals(s1CharCount, s2CharCount)) {
                return true;
            }

        }

        return false;
    }
}
