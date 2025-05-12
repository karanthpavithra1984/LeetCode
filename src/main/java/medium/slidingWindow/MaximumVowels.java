package medium.slidingWindow;

public class MaximumVowels {
    public int maxVowels(String s, int k) {
        int left = 0;
        int maxVowels = 0;
        int vowelCount = 0;

        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                vowelCount++;
            }
            if (right - left + 1 == k) {
                maxVowels = Math.max(maxVowels, vowelCount);
                left = right + 1;
                vowelCount = 0;
            }
        }

        return maxVowels;
    }

    private boolean isVowel(Character ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }

        return false;
    }
}
