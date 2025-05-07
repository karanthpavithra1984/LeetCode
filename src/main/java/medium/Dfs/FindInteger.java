package medium.Dfs;

public class FindInteger {
    public int findInteger(int k, int digit1, int digit2) {
        int res1 = dfs(digit1, digit2, digit1, k);
        int res2 = dfs(digit1, digit2, digit2, k);

        return res1 == -1 || res2 == -1 ? Math.max(res1, res2) : Math.min(res1, res2);
    }

    private int dfs(int digit1, int digit2, long current, int k) {
        if (current >= Integer.MAX_VALUE || current == 0) {
            return -1;
        }

        if (current > k && current % k == 0)
            return (int) current;

        int res1 = dfs(digit1, digit2, current * 10 + digit1, k);
        int res2 = dfs(digit1, digit2, current * 10 + digit2, k);

        return res1 == -1 || res2 == -1 ? Math.max(res1, res2) : Math.min(res1, res2);
    }
}
