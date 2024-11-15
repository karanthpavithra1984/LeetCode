package medium.Stack;

import org.junit.Test;
import utils.GeneralUtils;

public class AsteroidCollisionTest {
    AsteroidCollision asteroidCollision = new AsteroidCollision();

    @Test
    public void testAsteroidCollision(){
        GeneralUtils.compareValues(asteroidCollision.asteroidCollision(new int[]{5,10,-5}),new int[]{5,10});
        GeneralUtils.compareValues(asteroidCollision.asteroidCollision(new int[]{8,-8}),new int[]{});
        GeneralUtils.compareValues(asteroidCollision.asteroidCollision(new int[]{10,2,-5}), new int[]{10});
        GeneralUtils.compareValues(asteroidCollision.asteroidCollision(new int[]{-2,-1,1,2}), new int[]{-2,-1,1,2});
        GeneralUtils.compareValues(asteroidCollision.asteroidCollision(new int[]{-2,-2,1,-2}), new int[]{-2,-2,-2});
    }
}
