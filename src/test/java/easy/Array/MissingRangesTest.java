package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRangesTest {
    MissingRanges missingRanges = new MissingRanges();

    @Test
    public void testMissingRanges(){

        List<List<Integer>> expectedValues = new ArrayList<>();
        expectedValues.add(Arrays.asList(2,2));
        expectedValues.add(Arrays.asList(4,49));
        expectedValues.add(Arrays.asList(51,74));
        expectedValues.add(Arrays.asList(76,99));

        GeneralUtils.compareListOfList(missingRanges.findMissingRanges(new int[]{0,1,3,50,75}, 0 ,99), expectedValues);

        expectedValues.clear();

        GeneralUtils.compareListOfList(missingRanges.findMissingRanges(new int[]{-1}, -1 ,-1), expectedValues);

        expectedValues.add(Arrays.asList(-2, -2));

        GeneralUtils.compareListOfList(missingRanges.findMissingRanges(new int[]{-1}, -2, -1), expectedValues);

    }
}
