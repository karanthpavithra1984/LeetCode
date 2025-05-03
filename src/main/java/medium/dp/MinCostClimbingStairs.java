package medium.dp;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int current = 0, previous =0;

        for(int i = 2; i <= cost.length; i++){
            int temp = current;
            //Update the current
            current = Math.min(cost[i-2] + previous , cost[i-1] + current);
            previous = temp;
        }

        return current;

    }
}
