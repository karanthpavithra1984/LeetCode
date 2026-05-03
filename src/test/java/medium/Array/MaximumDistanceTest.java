package medium.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumDistanceTest {
    MaximumDistance ma = new MaximumDistance();

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3));

        List<List<Integer>> values = new ArrayList<>();
        values.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(4, 5));
        values.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3));
        values.add(list);

        assert ma.maxDistance(values) == 4;

        //[[-8,-7,-7,-5,1,1,3,4],[-2],[-10,-10,-7,0,1,3],[2]]
        values = new ArrayList<>();
        list = new ArrayList<>();
        list.addAll(Arrays.asList(-8, -7, -7, -5, 1, 1, 3, 4));
        values.add(list);

        list = new ArrayList<>();
        list.add(-2);
        values.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(-10, -10, -7, 0, 1, 3));
        values.add(list);

        list = new ArrayList<>();
        list.add(2);
        values.add(list);

        assert ma.maxDistance(values) == 14;
    }
}
