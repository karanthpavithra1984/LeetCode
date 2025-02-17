package easy.String;


public class StringSwap {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;

        int numOfDiffs = 0;
        int firstIndexDiff = -1;
        int secondIndexDiff = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                numOfDiffs++;

                if (numOfDiffs > 2) return false;

                if (numOfDiffs == 1) {
                    firstIndexDiff = i;
                } else {
                    secondIndexDiff = i;
                }
            }
        }

        if (secondIndexDiff == -1) return false;

        return (s1.charAt(firstIndexDiff) == s2.charAt(secondIndexDiff) && s1.charAt(secondIndexDiff) == s2.charAt(firstIndexDiff));
    }
}
