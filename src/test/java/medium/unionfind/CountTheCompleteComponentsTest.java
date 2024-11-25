package medium.unionfind;

import org.junit.Test;

public class CountTheCompleteComponentsTest {
    CountTheCompleteComponents ccm = new CountTheCompleteComponents();

    @Test
    public void testCountTheCompleteComponents() {
       assert  ccm.countCompleteComponents(6, new int[][]{{0,1},{0,2},{1,2},{3,4}}) == 3;
       assert ccm.countCompleteComponents(  6, new int[][]{{0,1},{0,2},{1,2},{3,4},{3,5}}) == 1;
    }
}
