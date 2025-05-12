package medium.greedy;

public class MaximumSwap {
    /**
     * Time Complexity o(n) - n is the length of the characters
     * Space complexity o(n) - space of the length of the charactesrs
     *
     * @param num
     * @return
     */
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        if (digits.length == 1) return num;

        int maxNumberIndex = -1, swapIndex1 = -1, swapIndex2 = -1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (maxNumberIndex == -1 || digits[i] > digits[maxNumberIndex]) {
                maxNumberIndex = i;
            } else if (digits[i] < digits[maxNumberIndex]) {
                swapIndex1 = i;
                swapIndex2 = maxNumberIndex;
            }
        }


        if (swapIndex1 == -1 || swapIndex2 == -1) return num;

        char temp = digits[swapIndex1];
        digits[swapIndex1] = digits[swapIndex2];
        digits[swapIndex2] = temp;


        return Integer.parseInt(new String(digits));
    }
}
