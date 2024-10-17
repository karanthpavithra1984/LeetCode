package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;

public class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void testMoveZeroes(){
        int[] nums = new int[]{0,1,0,3,10,0};
        moveZeroes.moveZeroes(nums);

        GeneralUtils.compareValues(nums, new int[]{1,3,10,0,0,0});
    }
}
