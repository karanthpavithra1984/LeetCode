package easy.Array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CanAttendMeetingsTest {
    CanAttendMeetings canAttendMeetings = new CanAttendMeetings();

    @Test
    public void testCanAttendMeetings(){
        int[][] arrays = new int[][]{{0,30},{5,10}, {15,20}};

        assertFalse(canAttendMeetings.canAttendMeetings(arrays));

        arrays = new int[][]{{7,10},{2,4}};

        assertTrue(canAttendMeetings.canAttendMeetings(arrays));
    }
}
