package easy.Stack;

import medium.Stack.ExclusiveTime;
import org.junit.Test;
import utils.GeneralUtils;

import java.util.Arrays;

public class ExclusiveTimeTest {
    ExclusiveTime ex = new ExclusiveTime();

    @Test
    public void test() {
        GeneralUtils.compareValues(ex.exclusiveTime(2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6")), new int[]{3, 4});
        GeneralUtils.compareValues(ex.exclusiveTime(1, Arrays.asList("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7")), new int[]{8});
    }
}
