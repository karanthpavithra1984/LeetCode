package medium.Array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindWinnerTicTacToeTest {
    FindWinnerTicTatToe f = new FindWinnerTicTatToe();

    @Test
    public void testF(){
        assertEquals(f.tictactoe(new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}}), "A");
    }
}
