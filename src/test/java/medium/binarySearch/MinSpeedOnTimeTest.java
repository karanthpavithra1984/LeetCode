package medium.binarySearch;

import medium.BinarySearch.MinSpeedOnTime;
import org.junit.Test;

public class MinSpeedOnTimeTest {
    MinSpeedOnTime minSpeedOnTime = new MinSpeedOnTime();

    @Test
    public void test() {
       assert minSpeedOnTime.minSpeedOnTime(new int[]{1,1,100000}, 2.01) == 10000000;
        assert minSpeedOnTime.minSpeedOnTime(new int[]{1,3,2}, 1.9) == -1;
        assert minSpeedOnTime.minSpeedOnTime(new int[]{1,3,2}, 2.7) == 3;
       assert minSpeedOnTime.minSpeedOnTime(new int[]{1,3,2}, 6) == 1;

    }
}
