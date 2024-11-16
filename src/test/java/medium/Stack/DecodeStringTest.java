package medium.Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringTest {
    DecodeString decodeString = new DecodeString();

    @Test
    public void testDecodeString(){
        assertEquals(decodeString.decodeString("3[a]2[bc]"), "aaabcbc");
        assertEquals(decodeString.decodeString("3[a2[c]]"), "accaccacc");
        assertEquals(decodeString.decodeString("2[abc]3[cd]ef"), "abcabccdcdcdef");
        assertEquals(decodeString.decodeString("abc3[cd]xyz"), "abccdcdcdxyz");
        assertEquals(decodeString.decodeString("100[leetcode]"), "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode");
        assertEquals(decodeString.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"), "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef");
    }
}
