package medium.Matrix;

import org.junit.Test;
import utils.GeneralUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalTraverseIITest {
    DiagonalTraverseII dt = new DiagonalTraverseII();
    DiagonalTraverseIIBFS dtb = new DiagonalTraverseIIBFS();

    @Test
    public void diagonalTraverse() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2, 3));
        input.add(Arrays.asList(4, 5, 6));
        input.add(Arrays.asList(7, 8, 9));

        GeneralUtils.compareValues(dt.findDiagonalOrder(input), new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9});

        List<List<Integer>> values = new ArrayList<>();
        values.add(Arrays.asList(1, 2, 3, 4, 5));
        values.add(Arrays.asList(6, 7));
        values.add(List.of(8));
        values.add(Arrays.asList(9, 10, 11));
        values.add(Arrays.asList(12, 13, 14, 15, 16));

        GeneralUtils.compareValues(dt.findDiagonalOrder(values), new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16});
    }

    @Test
    public void diagonalTraverseBFS() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2, 3));
        input.add(Arrays.asList(4, 5, 6));
        input.add(Arrays.asList(7, 8, 9));

        GeneralUtils.compareValues(dtb.findDiagonalOrder(input), new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9});

        List<List<Integer>> values = new ArrayList<>();
        values.add(Arrays.asList(1, 2, 3, 4, 5));
        values.add(Arrays.asList(6, 7));
        values.add(List.of(8));
        values.add(Arrays.asList(9, 10, 11));
        values.add(Arrays.asList(12, 13, 14, 15, 16));

        GeneralUtils.compareValues(dtb.findDiagonalOrder(values), new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16});
    }
}
