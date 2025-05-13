package hard.dp;

import java.util.Arrays;

public class PaintHouseIIIMy {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int MAX_COST = 1000001;
        //Have a DP Cache
        int[][] prevCost = new int[target + 1][n];
        for (int i = 0; i <= target; i++)
            Arrays.fill(prevCost[i], MAX_COST);

        //Fill up with the first house
        for (int color = 1; color <= n; color++) {
            //This basically is if the house is 0, then it needs to be painted, else it doesnt have to
            if (houses[0] == color) {
                // If the house has same color, no cost
                prevCost[1][color - 1] = 0;
            } else if (houses[0] == 0) {
                // If the house is not painted, assign the corresponding cost
                prevCost[1][color - 1] = cost[0][color - 1];
            }
        }

        //Start with next houses
        for (int house = 1; house < m; house++) {
            int[][] dp = new int[target + 1][n];

            for (int i = 0; i <= target; i++)
                Arrays.fill(dp[i], MAX_COST);

            //Min because its either the number of houses or target. If there are 2 houses and 3 target, then can only put houes in 2 neighborhood
            for (int neighborhood = 1; neighborhood <= Math.min(target, house + 1); neighborhood++) {
                for (int color = 1; color <= n; color++) {

                    // If the house is already painted, and color is different
                    if (houses[house] != 0 && color != houses[house]) {
                        // Cannot be painted with different color
                        continue;
                    }

                    int currCost = MAX_COST;
                    // Iterate over all the possible color for previous house
                    for (int prevColor = 1; prevColor <= n; prevColor++) {
                        if (prevColor != color) {
                            // Decrement the neighborhood as adjacent houses has different color
                            currCost = Math.min(currCost, prevCost[neighborhood - 1][prevColor - 1]);
                        } else {
                            // Previous house has the same color, no change in neighborhood count
                            currCost = Math.min(currCost, prevCost[neighborhood][color - 1]);
                        }
                    }

                    // If the house is already painted cost to paint is 0
                    int costToPaint = houses[house] != 0 ? 0 : cost[house][color - 1];
                    dp[neighborhood][color - 1] = currCost + costToPaint;
                }
            }
            prevCost = dp;
        }

        int minCost = MAX_COST;
        for (int color = 1; color <= n; color++) {
            minCost = Math.min(minCost, prevCost[target][color - 1]);
        }

        return minCost == MAX_COST ? -1 : minCost;
    }
}
