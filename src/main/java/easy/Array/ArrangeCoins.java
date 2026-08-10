package easy.Array;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        //The number of coins required to build k rows is k * (k+1) / 2

        long left = 0, right = n;

        long k, mid;

        while (left <= right) {
            k = left + (right - left) / 2;

            mid = k * (k + 1) / 2;

            if (mid == n)
                return (int) k;

            if (n < mid) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }

        return (int) right;
    }
}
