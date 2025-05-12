package medium.bfs;

import org.junit.Test;
import utils.GeneralUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordsWithTwoEditsOfDictionaryTest {
    WordsWithInTwoEditsOfDictionary wordsWithInTwoEditsOfDictionary = new WordsWithInTwoEditsOfDictionary();

    @Test
    public void test() {
        List<String> stringList = wordsWithInTwoEditsOfDictionary.
                twoEditWords(new String[]{"tsl", "sri", "yyy", "rbc", "dda", "qus", "hyb", "ilu", "ahd"},
                        new String[]{"uyj", "bug", "dba", "xbe", "blu", "wuo", "tsf", "tga"});
        assertEquals(GeneralUtils.convertToArrowSeperatedString(stringList.stream())
                , "tsl->yyy->rbc->dda->qus->hyb->ilu");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(wordsWithInTwoEditsOfDictionary
                .twoEditWords(new String[]{"word"}, new String[]{"note"}).stream()), "");
        assertEquals(GeneralUtils.convertToArrowSeperatedString(wordsWithInTwoEditsOfDictionary
                .twoEditWords(new String[]{"word", "note", "ants", "wood"}, new String[]{"wood", "joke", "moat"}).stream()), "word->note->wood");
    }
}
