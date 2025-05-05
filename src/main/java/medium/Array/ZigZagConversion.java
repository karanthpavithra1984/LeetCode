package medium.Array;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        //So these are the ones in section
        int charInSections = 2 * (numRows - 1);

        for (int i = 0; i < numRows; i++) {
            int index = i;
            while (index < n) {
                stringBuilder.append(s.charAt(index));
                //Now things get little tricky for the middle sections
                if (i > 0 && i < numRows - 1) {
                    int charsInbetween = charInSections - 2 * i;
                    int secondaryIndex = index + charsInbetween;
                    if (secondaryIndex < n)
                        stringBuilder.append(s.charAt(secondaryIndex));
                }

                //Append the next character in section
                index += charInSections;
            }
        }

        return stringBuilder.toString();
    }
}
