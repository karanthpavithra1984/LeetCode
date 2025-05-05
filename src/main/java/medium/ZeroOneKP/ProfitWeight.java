package medium.ZeroOneKP;

import java.util.List;

public class ProfitWeight {
    public int dfs(List<Integer> profit, List<Integer> weight, int capacity) {
        return dfsHelper(0, profit, weight, capacity);
    }

    public int dfsHelper(int i, List<Integer> profit, List<Integer> weight, int capacity) {
        if (i == profit.size()) {
            return 0;
        }

        System.out.println(" i-> " + i );
        // Skip item i
        int maxProfit = dfsHelper(i + 1, profit, weight, capacity);

        // Include item i
        int newCap = capacity - weight.get(i);
        if (newCap >= 0) {
            System.out.println("Capacity " + i);
            int p = profit.get(i) + dfsHelper(i + 1, profit, weight, newCap);
            // Compute the max
            System.out.println(" i-> " + i+ " weight -> " + weight.get(i) + " profit " + profit.get(i) + " maxProfit " + maxProfit );
            maxProfit = Math.max(maxProfit, p);
            System.out.println(" i-> " + i+ " weight -> " + weight.get(i) + " profit " + profit.get(i) + " maxProfit After " + maxProfit );
        }
        return maxProfit;
    }
}
