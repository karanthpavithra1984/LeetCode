package medium.Stack;

import org.junit.Test;
import utils.GeneralUtils;

public class NextGreaterElementIITest {
    NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();

    @Test
    public void nextGreaterElement() {
        GeneralUtils.compareValues(nextGreaterElementII.nextGreaterElements(new int[]{1,2,3,4,3}), new int[]{2,3,4,-1,4});
        GeneralUtils.compareValues(nextGreaterElementII.nextGreaterElements(new int[]{1,2,1}) , new int[]{2,-1,2});
        GeneralUtils.compareValues(nextGreaterElementII.nextGreaterElements(new int[]{3,8,4,1,2}) , new int[]{8,-1,8,2,3});
    }

    NextGreaterElementII2 nextGreaterElementII2 = new NextGreaterElementII2();

    @Test
    public void nextGreaterElement2() {
        GeneralUtils.compareValues(nextGreaterElementII2.nextGreaterElements(new int[]{1,2,3,4,3}), new int[]{2,3,4,-1,4});
        GeneralUtils.compareValues(nextGreaterElementII2.nextGreaterElements(new int[]{1,2,1}) , new int[]{2,-1,2});
        GeneralUtils.compareValues(nextGreaterElementII2.nextGreaterElements(new int[]{3,8,4,1,2}) , new int[]{8,-1,8,2,3});
    }
}
