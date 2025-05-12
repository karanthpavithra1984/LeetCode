package easy.twopointers;

/**
 * Time Complexity worst case o(n) - number of words
 * Space Complexity o(1)
 */
public class FindFirstPalindrome {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    private boolean isPalindrome(String word) {
        int leftIndex = 0, rightIndex = word.length() - 1;

        while (leftIndex < rightIndex) {
            if (word.charAt(leftIndex) != word.charAt(rightIndex)) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
