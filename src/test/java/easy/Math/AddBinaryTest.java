package easy.Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void test() {
        assertEquals(addBinary.addBinary("1111", "1111"), "11110");
        assertEquals(addBinary.addBinary("0", "0"), "0");
        assertEquals(addBinary.addBinary("11", "0"), "11");
        assertEquals(addBinary.addBinary("1010", "1011"), "10101");
        assertEquals(addBinary.addBinary("11", "1"), "100");

    }
}
