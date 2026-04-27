package easy.Array;

public class LargestGoodInteger {
    public String largestGoodInteger(String num) {
        String largest = "";
        int max = -1;
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
                int charAt = num.charAt(i);
                if (max < charAt) {
                    largest = num.substring(i - 2, i + 1);
                    max = charAt;
                }
            }
        }

        return largest;
    }
}
