package medium.unionfind;

import org.junit.Test;
import utils.GeneralUtils;

public class RedudantConnectionsTest {
    RedudantConnections redudantConnections = new RedudantConnections();

    @Test
    public void testRedudantConnections(){
        GeneralUtils.compareValues(redudantConnections.findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}}), new int[]{2,3});
        GeneralUtils.compareValues(redudantConnections.findRedundantConnection(new int[][]{{1,2},{1,3},{3,4},{2,4}}), new int[]{2,4});
    }
}
