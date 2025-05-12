package medium.Stack;

import java.util.Stack;

public class RemoveDuplicates2 {
    /**
     * Time Complexity o(n + number of delete i.e o(n)) which is going to be o(n)
     * Space Complexity o(n)
     *
     * @param s
     * @param k
     * @return
     */
    public String removeDuplicates(String s, int k) {
        Stack<Integer> counter = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (i == 0 || stringBuilder.charAt(i) != stringBuilder.charAt(i - 1)) {
                counter.push(1);
            } else {
                int increment = counter.pop() + 1;
                if (increment == k) {
                    stringBuilder.delete(i - k + 1, i + 1);
                    i = i - k;
                } else {
                    counter.push(increment);
                }
            }
        }


        return stringBuilder.toString();
    }
}
