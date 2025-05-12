package easy.Array;

/**
 * Time Complexity o(n)
 * Space Complexity o(1)
 */

public class isCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean isCovered = false;
        for (int i = left; i <= right; i++) {
            isCovered = false;
            for (int[] range : ranges) {
                if (range[0] <= i && range[1] >= i) {
                    isCovered = true;
                    break;
                }
            }

            if (!isCovered)
                return false;
        }

        return isCovered;
    }
}
