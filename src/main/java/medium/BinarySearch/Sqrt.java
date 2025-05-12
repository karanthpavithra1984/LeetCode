package medium.BinarySearch;

public class Sqrt {
    public int mySqrt(int x) {
        //For x≥2 the square root is always smaller than
        // x/2 and larger than 0 :0<a<x/2.

        if (x < 2) return x;

        int left = 2, right = x / 2;


        while (left <= right) {
            //Numbers are going to be Integer.MAX_VALUE
            //Since mid2 could be greater than MAX_VALUE, we will have to make it longer
            int mid = left + (right - left) / 2;
            long mid2 = (long) mid * mid;
            if (mid2 == x) return mid;
            else if (mid2 < x) left = mid + 1;
            else right = mid - 1;
        }

        return right;

    }
}
