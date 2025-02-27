package medium.twopointers;

import org.junit.Test;

public class MinMeetingRoomsTest {
    MinMeetingRooms m = new MinMeetingRooms();

    @Test
    public void minMeetingRooms() {
       assert  m.minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}) == 2;
    }
}
