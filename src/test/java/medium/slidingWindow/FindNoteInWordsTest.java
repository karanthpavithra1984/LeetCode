package medium.slidingWindow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNoteInWordsTest {
    FindNoteInWords findNoteInWords = new FindNoteInWords();

    @Test
    public void testFindNoteInWords(){
        assertEquals(findNoteInWords.findNote(new String[]{"baby", "cat", "dog", "note"}, "gbdto") , "dog");
        assertEquals(findNoteInWords.findNote(new String[]{"baby", "cat", "dog", "note"}, "cayt") , "cat");
        assertEquals(findNoteInWords.findNote(new String[]{"baby", "cat", "dog", "note"}, "bbbasdasdiiiiewewewe"), "-");
    }
}
