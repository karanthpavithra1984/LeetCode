package hard.Graph;

import hard.graph.AlienDictionary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlienDictionaryTest {
    AlienDictionary dic = new AlienDictionary();

    @Test
    public void test() {
       assertEquals(dic.alienOrder(new String[]{"wrt","wrf","er","ett","rftt"}),"wertf");
    }
}
