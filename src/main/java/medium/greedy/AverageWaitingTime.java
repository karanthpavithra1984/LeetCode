package medium.greedy;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        int startTime = customers[0][0];
        int finishedPrev = customers[0][0] + customers[0][1];
        double totalTime = finishedPrev - startTime;

        for (int i = 1; i < customers.length; i++) {
            int nextCustArrives = customers[i][0];

            startTime = Math.max(nextCustArrives, finishedPrev);
            int cookingEnds = startTime + customers[i][1];
            finishedPrev = cookingEnds;
            totalTime += cookingEnds - nextCustArrives;
        }

        return totalTime / customers.length;
    }
}
