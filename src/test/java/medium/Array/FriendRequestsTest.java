package medium.Array;

import easy.Array.FriendRequests;
import org.junit.Test;

public class FriendRequestsTest {
    FriendRequests friendRequests = new FriendRequests();

    @Test
    public void testFriendRequests() {
        assert friendRequests.numFriendRequests(new int[]{20, 30, 100, 110, 120}) == 3;
        assert friendRequests.numFriendRequests(new int[]{16, 17, 18}) == 2;
        assert friendRequests.numFriendRequests(new int[]{16, 16}) == 2;
    }
}
