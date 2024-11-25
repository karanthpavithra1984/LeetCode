package hard.unionfind;

import org.junit.Test;
import utils.GeneralUtils;

public class FriendRequestsTest {
    FriendRequests friendRequests = new FriendRequests();

    @Test
    public void testFriendsRequests() {
        GeneralUtils.compareValues(friendRequests.friendRequests(3, new int[][]{{0, 1}}, new int[][]{{0, 2}, {2, 1}})
                , new boolean[]{true, false});
        GeneralUtils.compareValues(friendRequests.friendRequests(3, new int[][]{{0, 1}}, new int[][]{{1, 2}, {0, 2}})
                , new boolean[]{true, false});
        GeneralUtils.compareValues(friendRequests.friendRequests(5, new int[][]{{0,1},{1,2},{2,3}},
                        new int[][]{{0,4},{1,2},{3,1},{3,4}})
                , new boolean[]{true,false,true,false});
        GeneralUtils.compareValues(friendRequests.friendRequests(7, new int[][]{{0,6},{6,2}},
                        new int[][]{{0,2},{2,3},{0,2},{6,4},{6,4}})
                , new boolean[]{true,true,true,true,true});
    }
}
