package medium.Array;

import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void test() {
        TicTacToe ticTacToe2 = new TicTacToe(2);
        assert ticTacToe2.move(0,1,1) == 0;
        assert ticTacToe2.move(1,1,2) == 0;
        assert ticTacToe2.move(1,0,1) == 1;


        TicTacToe ticTacToe = new TicTacToe(3);

        assert ticTacToe.move(0,0,1) == 0;
        assert ticTacToe.move(0,2,2) == 0;
        assert ticTacToe.move(2,2,1) == 0;
        assert ticTacToe.move(1,1,2) == 0;
        assert ticTacToe.move(2,0,1) == 0;
        assert ticTacToe.move(1,0,2) == 0;
        assert ticTacToe.move(2,1,1) == 1;


    }
}
