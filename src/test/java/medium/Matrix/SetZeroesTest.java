package medium.Matrix;

import org.junit.Test;

public class SetZeroesTest {
    SetZeroes setZeroes = new SetZeroes();

    @Test
    public void test() {
        setZeroes.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
        setZeroes.setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});

    }
}
