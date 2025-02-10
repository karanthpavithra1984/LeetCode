package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationsLeetCode {
    private int n;
    private int k;
    private int counter = 0;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), 1, ans);
        System.out.println("CombinationLeetCode" + counter);
        return ans;
    }

    public void backtrack(
            List<Integer> curr,
            int firstNum,
            List<List<Integer>> ans
    ) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        int need = k - curr.size();
        int remain = n - firstNum + 1;
        int available = remain - need;

        System.out.println("firstNum " + firstNum + ",need " + need + ", remain " + remain + ", available " + available);

        System.out.println("firstNum + available" + (firstNum + available));
        for (int num = firstNum; num <= firstNum + available; num++) {
            System.out.println("index" + num);
            curr.add(num);
            backtrack(curr, num + 1, ans);
            curr.remove(curr.size() - 1);
        }
    }
}
