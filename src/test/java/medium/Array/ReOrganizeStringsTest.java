package medium.Array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReOrganizeStringsTest {
    ReorganizeStrings reorganizeStrings = new ReorganizeStrings();

    @Test
    public void test() {
        assertEquals(reorganizeStrings.reorganizeString("zqugrfbsznyiwbokwkpvpmeyvaosdkedbgjogzdpwawwl"), "wkwlwmwnwoaoaobpbpbpdqdrdseseufvgvgygyizjzkzk");
        assertEquals(reorganizeStrings.reorganizeString("aab"), "aba");
        assertEquals(reorganizeStrings.reorganizeString("aaab"), "");
        assertEquals(reorganizeStrings.reorganizeString("bfrbs"), "brbsf");
    }
}
