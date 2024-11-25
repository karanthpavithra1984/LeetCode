package easy.unionfind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPathTest {
    ValidPath validPath = new ValidPath();

    @Test
    public void isValid() {
        assertTrue(validPath.validPath( 3, new int[][]{{0,1},{1,2},{2,0}},  0, 2));
        assertFalse(validPath.validPath(6, new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}},  0,5));
    }
}
