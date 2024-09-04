package hard.dp;

/**
 * Dynamic Programming Top Down/Recursion/Memoization with two pointers
 *
 * Time Complexity - worst case o(n2)
 * Space complexity integer multi array - o(n2)
 */

public class ValidPalindrome3 {
    Integer[][] cache;

    private Integer validPalindrome(String s, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex)
            return 0;

        if (leftIndex == rightIndex - 1) {
            if (s.charAt(leftIndex) == s.charAt(rightIndex)) return 0;
            return 1;
        }

        if (cache[leftIndex][rightIndex] != null)
            return cache[leftIndex][rightIndex];

        if (s.charAt(leftIndex) == s.charAt(rightIndex)) {
            cache[leftIndex][rightIndex] = validPalindrome(s, leftIndex + 1, rightIndex - 1);
            return cache[leftIndex][rightIndex];
        }

        cache[leftIndex][rightIndex] = 1 + Math.min(validPalindrome(s, leftIndex + 1, rightIndex), validPalindrome(s, leftIndex, rightIndex - 1));
        return cache[leftIndex][rightIndex];
    }

    public boolean isValidPalindrome(String s, int k) {
        cache = new Integer[s.length()][s.length()];

        return validPalindrome(s, 0, s.length() - 1) <= k;
    }
}
