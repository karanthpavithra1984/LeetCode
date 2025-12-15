package easy.String;

public class CheckRecord {
    public boolean checkRecord(String s) {
        int totalAbsents = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                if (totalAbsents >= 2) {
                    return false;
                }
                totalAbsents++;
            } else if (i > 0 && i != s.length() - 1 && c == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i - 1) == 'L') {
                return false;
            }
        }

        return totalAbsents < 2;
    }
}
