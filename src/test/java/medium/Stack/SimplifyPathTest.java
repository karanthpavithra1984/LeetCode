package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathTest {
    SimplifyPath simplifyPath = new SimplifyPath();

    @Test
    public void testSimplifyPath(){
       assertEquals(simplifyPath.simplifyPath("/home//foo/"), "/home/foo");
       assertEquals(simplifyPath.simplifyPath("/../"), "/");
       assertEquals(simplifyPath.simplifyPath( "/.../a/../b/c/../d/./"), "/.../b/d");
    }
}
