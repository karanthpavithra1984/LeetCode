package hard.Graph;

import hard.graph.ParallelCoursesIIIDfs;
import org.junit.Test;

public class ParallelCoursesIIIDfsTest {
    ParallelCoursesIIIDfs parallelCoursesIIIDfs = new ParallelCoursesIIIDfs();

    @Test
    public void testCourseDfs(){
        assert parallelCoursesIIIDfs.minimumTime(5, new int[][]{{1,5},{2,5},{3,5},{3,4},{4,5}}, new int[]{1,2,3,4,5}) == 12;
        assert parallelCoursesIIIDfs.minimumTime(3, new int[][]{{1,3},{2,3}} , new int[]{3,2,5}) == 8;
    }
}
