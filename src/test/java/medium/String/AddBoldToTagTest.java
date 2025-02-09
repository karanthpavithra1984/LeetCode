package medium.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBoldToTagTest {

    AddBoldToTag addBoldToTag = new AddBoldToTag();

    @Test
    public void testAddBoldToTag(){
        assertEquals(addBoldToTag.addBoldTag("abcxyz123", new String[]{"abc", "123"}), "<b>abc</b>xyz<b>123</b>");
    }
}
