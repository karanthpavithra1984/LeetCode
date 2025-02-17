package easy.String;

import org.junit.Test;

public class FindTheDifferenceTest {
    FindTheDifference f = new FindTheDifference();

    @Test
    public void findTheDifference() {
        f.findTheDifference("abcd", "abcda");
        f.findTheDifference("", "y");
        f.findTheDifference("abcd", "abcde");
    }
}
