package easy.Array;

public class StringIterator {
    String compressedString;
    char ch = ' ';
    int ptr = 0, num = 0;

    public StringIterator(String compressedString) {
        this.compressedString = compressedString;
    }

    public char next() {
        if (!hasNext()) {
            return ' ';
        }

        if (num == 0) {
            ch = compressedString.charAt(ptr);
            ptr++;
            while (ptr < compressedString.length() && Character.isDigit(compressedString.charAt(ptr))) {
                int chNum = compressedString.charAt(ptr) - '0';
                num = num * 10 + chNum;
                ptr++;
            }

        }
        num--;
        return ch;
    }

    public boolean hasNext() {
        return ptr < compressedString.length() || num != 0;
    }
}
