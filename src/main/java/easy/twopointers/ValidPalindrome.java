package easy.twopointers;

/**
 * Time Complexity -> o(N) - N is the length of the string i.e characters
 * Space Complexity -> o(1)
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;

        int leftIndex = 0, rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            if (!Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(leftIndex)) != Character.toLowerCase(s.charAt(rightIndex))) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }

}
