package medium.slidingWindow;

public class NumberOfSubStringsContainingAllChars {
    public int numberOfSubstrings(String s) {
        int left = 0, right = 0;
        int[] freqArray = new int[3];
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            freqArray[s.charAt(i) - 'a']++;

            while (hasAllCharacters(freqArray)) {
                total += left - right;

                freqArray[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return total;
    }

    private boolean hasAllCharacters(int[] freqArray) {
        return freqArray[0] > 0 && freqArray[1] > 0 && freqArray[2] > 0;
    }
}
