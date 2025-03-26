package medium.dp;

public class MinCostTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int[] costsPerDay = new int[lastDay + 1];

        int i = 0;
        for (int day = 1; day <= lastDay; day++) {
            if (day != days[i]) {
                //If not a travel day use the previous Day value
                costsPerDay[day] = costsPerDay[day - 1];
            } else {
                i++;
                int oneDayCost = costsPerDay[day - 1] + costs[0];
                int sevenDayCost = costs[1];
                int thirtyDayCost = costs[2];
                if (day >= 7) {
                    sevenDayCost += costsPerDay[day - 7];
                }

                if (day >= 30) {
                    thirtyDayCost += costsPerDay[day - 30];
                }
                //Get the minimum
                costsPerDay[day] = Math.min(oneDayCost, Math.min(sevenDayCost, thirtyDayCost));

            }
        }

        return costsPerDay[lastDay];
    }
}
