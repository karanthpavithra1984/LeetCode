package easy.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoatLatinTest {
    GoatLatin goatLatin = new GoatLatin();

    @Test
    public void test() {
        assertEquals(goatLatin.toGoatLatin("I speak Goat Latin"),"Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
    }
}
