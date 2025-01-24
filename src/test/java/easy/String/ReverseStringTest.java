package easy.String;

import org.junit.Test;
import utils.GeneralUtils;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void reverseString() {
        char[] characters = new char[]{'h','e','l','l','o'};
        reverseString.reverseString(characters);
        GeneralUtils.compareValues(characters
                , new char[]{'o','l','l','e','h'});
    }
}
