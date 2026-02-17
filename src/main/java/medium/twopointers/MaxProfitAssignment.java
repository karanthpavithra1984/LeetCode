package medium.twopointers;

import java.util.*;

public class MaxProfitAssignment {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> difficultyProfitMap = new LinkedList<int[]>();
        for (int i = 0; i < difficulty.length; i++) {
            difficultyProfitMap.add(new int[] { difficulty[i], profit[i] });
        }

        Arrays.sort(worker);
        difficultyProfitMap.sort(Comparator.comparingInt(a -> a[0]));

        int difficultyIndex = 0, netProfit = 0, maxProfit = 0;

        for (int i = 0; i < worker.length; i++) {
            while (difficultyIndex < difficulty.length && worker[i] >= difficultyProfitMap.get(difficultyIndex)[0]) {
                maxProfit = Math.max(maxProfit, difficultyProfitMap.get(difficultyIndex)[1]);
                difficultyIndex++;
            }

            netProfit += maxProfit;
        }

        return netProfit;
    }


}
