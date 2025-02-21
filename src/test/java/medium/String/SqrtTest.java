package medium.String;

import medium.BinarySearch.Sqrt;
import org.junit.Test;

public class SqrtTest {
    Sqrt sqrt = new Sqrt();

    @Test
    public void testSqrt() {
       assert sqrt.mySqrt(2147395599) == 46339;
       assert sqrt.mySqrt(2) == 1;
       assert sqrt.mySqrt(3) == 1;
       assert sqrt.mySqrt(4) == 2;
       assert sqrt.mySqrt(5) == 2;
    }
}
