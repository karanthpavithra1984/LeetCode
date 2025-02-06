package hard.stack;

import easy.Stack.NextGreaterElement;
import org.junit.Test;
import utils.GeneralUtils;

public class NextGreaterElementTest {
    NextGreaterElement nextGreaterElement = new NextGreaterElement();

    @Test
    public void test() {
        GeneralUtils.compareValues(
                nextGreaterElement.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}
                       ), new int[]{-1,3,-1});
    }
}
