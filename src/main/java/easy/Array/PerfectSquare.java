package easy.Array;

public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 2, right = num / 2, guesssquared, k;

        while (left <= right) {
            k = left + (right - left) / 2;

            guesssquared = k * k;

            if (guesssquared == num)
                return true;

            if (guesssquared > num) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }

        return false;
    }
}
