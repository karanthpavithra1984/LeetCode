package medium.Stack;

import org.junit.Test;

public class LengthOfLongestPathTest {
    LengthOfLongestPath lengthOfLongestPath = new LengthOfLongestPath();

    @Test
    public void testLengthOfLongestPath(){
        assert lengthOfLongestPath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext") == 20;
        assert lengthOfLongestPath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext") == 32;
    }
}
