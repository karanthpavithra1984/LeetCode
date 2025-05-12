package easy.LinkedList;

import easy.linkedList.WinnerOfTheGame;
import org.junit.Test;
import utils.GeneralUtils;
import utils.ListNode;

public class WinnerOfTheGameTest {

    WinnerOfTheGame winnerOfTheGame = new WinnerOfTheGame();

    @Test
    public void testWinnerOfTheGame() {
        ListNode listNode = GeneralUtils.getListNode(new int[]{2, 1});

        assert winnerOfTheGame.gameResult(listNode) == "Even";

        listNode = GeneralUtils.getListNode(new int[]{2, 5, 4, 7, 20, 5});

        assert winnerOfTheGame.gameResult(listNode) == "Odd";
    }
}
