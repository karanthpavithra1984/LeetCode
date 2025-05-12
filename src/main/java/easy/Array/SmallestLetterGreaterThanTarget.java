package easy.Array;

/**
 * Time complexity - Binary search  - o(logn)
 * Space complexity - o(1)
 */
public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < letters[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return left >= letters.length ? letters[0] : letters[left];
    }
}
