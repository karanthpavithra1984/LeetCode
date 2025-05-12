package hard.dp;

import org.junit.Test;

public class TotalAppealOfStringTest {
    TotalAppealOfAString totalAppealOfAString = new TotalAppealOfAString();

    @Test
    public void test() {
        assert totalAppealOfAString.appealSum("abbb") == 13;
        assert totalAppealOfAString.appealSum("abbca") == 28;
        assert totalAppealOfAString.appealSum("code") == 20;
    }
}
