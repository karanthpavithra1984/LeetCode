package medium.backtracking;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class SubSetsTest {
    SubSets subSets = new SubSets();


    @Test
    public void test() {
        subSets.subsets(new int[] { 1, 2, 3 });
    }
}
