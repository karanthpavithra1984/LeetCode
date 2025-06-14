package medium.Array;

public class LongestPalindromeByConctaneting {
    public int longestPalindrome(String[] words) {
        int[][] charMap = new int[26][26];
        int count = 0;
        int sameCharCount = 0;
        for (String word : words) {
            int charOne = word.charAt(0) - 'a';
            int charTwo = word.charAt(1) - 'a';
            //Check if the reverse is there
            if (charMap[charTwo][charOne] > 0) {
                charMap[charTwo][charOne]--;
                //Since there are two characters;
                count += 4;

                //Reduce it as we already included them.
                if (charTwo == charOne) {
                    sameCharCount--;
                }
            } else {
                charMap[charOne][charTwo]++;
                if (charOne == charTwo) {
                    sameCharCount++;
                }
            }
        }

        if (sameCharCount > 0) {
            count += 2;
        }

        return count;
    }
}
