package medium.twopointers;

public class MinimumLength {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            char currentChar = s.charAt(left);

            while (left <= right && currentChar == s.charAt(left)) {
                left++;//Shrink prefix
            }

            while (left <= right && currentChar == s.charAt(right)) {
                right--;//shrink suffix
            }
        }

        return right - left + 1;
    }
}
