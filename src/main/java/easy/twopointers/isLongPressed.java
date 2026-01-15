package easy.twopointers;

public class isLongPressed{
    public boolean isLongPressedName(String name, String typed) {
        int nameIndex = 0, typedIndex = 0;

        char[] namedChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();

        while (nameIndex < namedChars.length && typedIndex < typedChars.length) {
            if (namedChars[nameIndex] == typedChars[typedIndex]) {
                nameIndex++;
                typedIndex++;
            } else if (typedIndex > 0 && typedChars[typedIndex] == typedChars[typedIndex - 1]) {
                typedIndex++;
            } else {
                return false;
            }
        }

        if (nameIndex != namedChars.length) {
            return false;
        }

        while (typedIndex < typedChars.length) {
            if (typedChars[typedIndex] == typedChars[typedIndex - 1]) {
                typedIndex++;
            } else {
                return false;
            }
        }

        return true;
    }
}
