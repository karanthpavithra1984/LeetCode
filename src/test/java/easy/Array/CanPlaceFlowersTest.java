package easy.Array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @Test
    public void testCanPlaceFlowers() {
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
        assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{0,1,0}, 1));
        assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0,0,0,0,0,1,0,0}, 0));
    }
}
