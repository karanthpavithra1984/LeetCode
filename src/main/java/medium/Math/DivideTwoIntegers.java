package medium.Math;

public class DivideTwoIntegers {
    /**
     *
     * The brute force way is to do elemenatry math
     * i.e substract the dividend by the divisor until the divident becomes less than divisor
     * However we will have to handle the edge cases , because the system we are going to use
     * is only going to allow the integer range.
     * And also if we are dividing - 2^31 / -1 , it will result in 2^31 which is outside of the
     * positive integer range i.e 2^31.
     *
     * This is a good approach but needs multiple substractions and might throw TLE
     * for the larger numbers as the loop is bigger.
     *
     * The other way is to exponentially substract by the power of two.
     * @param dividend
     * @param divisor
     * @return
     */

    /**
     * Time Complexity o(logn * logn)
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
        //Handle edge case
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        final int HALF_INT_MIN = -1073741824;

        //Negatives are tricky ,
        //Suppose the dividend is Integer.MIN_VALUE and divisor is greater than 2
        //using positive number and keeping track of the negatives is not going to work
        //Because the Integer.MIN_VALUE is out of range for positive.
        //So it's better to use negative

        int negative = 2;
        if(divisor > 0 ){
            divisor = -divisor;
            negative--;
        }

        if(dividend > 0){
            dividend = -dividend;
            negative--;
        }
        int quotient = 0;
        while(divisor >= dividend){
            int powerOfTwo = -1;
            int value = divisor;
            //HALF_INT_MIN is negative and the moment the value becomes less than
            //We need to stop doubling.
            //By less if it hits -1073741824 , and then double of that would be out of range
            //for positive number
            while(value >= HALF_INT_MIN && value + value >= dividend){
                value+= value;
                powerOfTwo += powerOfTwo;
            }

            dividend -= value;
            quotient += powerOfTwo;
        }

        if(negative != 1){
            quotient = -quotient;
        }

        return quotient;
    }
}
