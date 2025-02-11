package medium.Stack;

import org.junit.Test;
import utils.GeneralUtils;

public class DailyTemperaturesTest {
    DailyTemperatures dt = new DailyTemperatures();

    @Test
    public void test() {
        GeneralUtils.compareValues(
                dt.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}), new int[]{1,1,4,2,1,1,0,0});
        GeneralUtils.compareValues(
                dt.dailyTemperatures(new int[]{30,40,50,60}), new int[]{1,1,1,0});
    }
}
