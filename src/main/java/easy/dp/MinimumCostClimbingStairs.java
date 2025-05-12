package easy.dp;

public class MinimumCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int oneStep = 0, twoStep = 0;

        for (int i = 2; i < cost.length + 1; i++) {
            int temp = oneStep;
            oneStep = Math.min(cost[i - 1] + oneStep, cost[i - 2] + twoStep);
            twoStep = temp;
        }

        return oneStep;
    }
}
