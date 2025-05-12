package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasCalsTriangleTest {
    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    public void testPascalstriangle() {
        List<List<Integer>> expectedValues = new ArrayList<>();
        expectedValues.add(Arrays.asList(1));
        GeneralUtils.compareListOfList(pascalsTriangle.generate(1), expectedValues);

        expectedValues.add(Arrays.asList(1, 1));
        GeneralUtils.compareListOfList(pascalsTriangle.generate(2), expectedValues);

        expectedValues.add(Arrays.asList(1, 2, 1));
        GeneralUtils.compareListOfList(pascalsTriangle.generate(3), expectedValues);

        expectedValues.add(Arrays.asList(1, 3, 3, 1));
        GeneralUtils.compareListOfList(pascalsTriangle.generate(4), expectedValues);

        expectedValues.add(Arrays.asList(1, 4, 6, 4, 1));
        GeneralUtils.compareListOfList(pascalsTriangle.generate(5), expectedValues);
    }
}
