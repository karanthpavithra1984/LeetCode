package medium.Math;

public class Pow {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n == 1) return x;

        // Handle case where, n < 0.
        if (n < 0) {
            n = -1 * n;
            x = 1.0 / x;
        }

        // Perform Binary Exponentiation.
        double result = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                result = result * x;
                n -= 1;
            }
            if (n == 0) return result;
            x = x * x;
            n = n / 2;
        }

        return result;
    }
}
