package medium.greedy;

/**
 * Time Complexity o(n)
 * Space o(n)
 */

public class MaximumSwapII {
    public int maximumSwap(int num) {
        //Store the values in a lastseen bucket

        if (num < 10) return num;

        int[] lastSeen = new int[10];
        char[] chars = String.valueOf(num).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            lastSeen[chars[i] - '0'] = i;
        }

        //loop through it again and loop through the largest digit to see if it can be swapped
        for (int i = 0; i < chars.length; i++) {
            for (int d = lastSeen.length - 1; d > chars[i] - '0'; d--) {
                //If the lastSeen index is greater than current Index
                //Then we found our swap
                if (lastSeen[d] > i) {
                    char temp = chars[i];
                    chars[i] = chars[lastSeen[d]];
                    chars[lastSeen[d]] = temp;

                    //Immediately return as we need only one swap.
                    return Integer.parseInt(new String(chars));
                }
            }
        }

        return num;
    }
}
