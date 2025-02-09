package medium.bfs;

import org.junit.Test;

public class MinMutationTest {
    MinMutation m = new MinMutation();

    @Test
    public void test() {
        assert  m.minMutation("AAAACCCC",  "CCCCCCCC",
                new String[]{"AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"}) == 4;
       assert  m.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}) == 1;
       assert  m.minMutation("AACCGGTT",  "AAACGGTA", new String[]{"AACCGGTA","AACCGCTA",
               "AAACGGTA"}) == 2;

    }
}
