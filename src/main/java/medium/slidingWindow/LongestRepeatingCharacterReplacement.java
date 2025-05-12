package medium.slidingWindow;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] character = new int[26];
        int left = 0, right = 0;
        int maxLength = 0;
        int res = 0;
        while (right < s.length()) {
            int value = s.charAt(right) - 'A';
            character[value]++;
            maxLength = Math.max(character[value], maxLength);
            if (right - left + 1 - maxLength <= k) {
                character[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
