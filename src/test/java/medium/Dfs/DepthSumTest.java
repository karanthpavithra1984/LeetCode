package medium.Dfs;

import org.junit.Test;
import utils.NestedInteger;

import java.util.ArrayList;
import java.util.List;

public class DepthSumTest {
    DepthSum depthSum = new DepthSum();

    @Test
    public void test() {
        List<NestedInteger> mainList = new ArrayList<>();
        mainList.add(new NestedInteger(2));

        NestedInteger n1 = new NestedInteger();
        n1.add(new NestedInteger(1));
        n1.add(new NestedInteger(1));
        mainList.add(n1);

        NestedInteger n2 = new NestedInteger();
        n2.add(new NestedInteger(1));
        n2.add(new NestedInteger(1));
        mainList.add(n2);

        assert depthSum.depthSum(mainList) == 10;
    }
}
