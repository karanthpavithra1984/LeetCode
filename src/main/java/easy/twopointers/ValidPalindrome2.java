package easy.twopointers;

/**
 * Time Complexity o(N) - I am calling isValidPalindrome only once , i.e the first time the characters dont match.
 * Space Complexity o(1) - - Not creating any other additional space , other than left and rightIndexes
 */

public class ValidPalindrome2 {

    private boolean isValidPalindrome(String str, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }

            leftIndex++;
            rightIndex--;

        }

        return true;
    }

    public boolean validPalindrome(String str) {
        int leftIndex = 0, rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return isValidPalindrome(str, leftIndex, rightIndex - 1) || isValidPalindrome(str, leftIndex + 1, rightIndex);
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }


}
