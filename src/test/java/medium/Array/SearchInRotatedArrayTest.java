package medium.Array;

import org.junit.Test;

public class SearchInRotatedArrayTest {
    SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();

    @Test
    public void searchInRotatedArray() {
        assert searchInRotatedArray.search(new int[]{3,1}, 1) == 1;
        assert searchInRotatedArray.search(new int[]{5,1,3}, 5) == 0;
        assert searchInRotatedArray.search(new int[]{1,3} ,3) == 1;
        assert searchInRotatedArray.search(new int[]{4,5,6,7,0,1,2} ,0) == 4;
        assert searchInRotatedArray.search(new int[]{4,5,6,7,0,1,2} ,3) == -1;

    }
}
