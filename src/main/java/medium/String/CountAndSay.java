package medium.String;

public class CountAndSay {
    /**
     * Time Complexity 4^n/3
     * For every
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        String res = "1";
        if (n == 1)
            return res;

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < res.length(); j++) {
                char ch = res.charAt(j);
                int count = 1;
                while (j < res.length() - 1 && ch == res.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(ch);
            }

            res = sb.toString();
        }

        return res;

    }
}
