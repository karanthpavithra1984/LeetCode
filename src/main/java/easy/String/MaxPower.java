package easy.String;

public class MaxPower {
    public int maxPower(String s) {
        if (s.length() == 1) return 1;

        int maxLength = 0;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count = 1;
            } else {
                count++;
            }

            maxLength = Math.max(maxLength, count);
        }

        return Math.max(maxLength, count);
    }
}
