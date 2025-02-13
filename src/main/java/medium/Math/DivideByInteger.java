package medium.Math;

public class DivideByInteger {

    public int divide(int dividend, int divisor) {
        // Special case: overflow.
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }


        boolean isNegative = true;
        if (dividend > 0) {
            isNegative = !isNegative;
            dividend = -dividend;
        }
        if (divisor > 0) {
            isNegative = !isNegative;
            divisor = -divisor;
        }


        int quotient = 0;
        while (dividend - divisor <= 0) {
            quotient--;
            dividend -= divisor;
        }


        if (isNegative) {
            quotient = -quotient;
        }
        return quotient;
    }
}


