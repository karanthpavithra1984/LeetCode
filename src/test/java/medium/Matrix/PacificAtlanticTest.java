package medium.Matrix;

import org.junit.Test;
import utils.GeneralUtils;

import static org.junit.Assert.assertEquals;

public class PacificAtlanticTest {
    PacificAtlantic pacificAtlantic = new PacificAtlantic();

    @Test
    public void testPacificAtlantic() {

        assertEquals(GeneralUtils.convertToArrowSeperatedString(
                        pacificAtlantic.pacificAtlantic(new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}}).stream()),
                "[0, 4]->[1, 3]->[1, 4]->[2, 2]->[3, 0]->[3, 1]->[4, 0]");
    }
}
